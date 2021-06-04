package uz.daba.gateway.resources;

//import io.swagger.v3.oas.annotations.tags.Tag;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.daba.gateway.constants.AConst;
import uz.daba.gateway.constants.ErrorEnum;
import uz.daba.gateway.constants.urls.UriCourt;
import uz.daba.gateway.dao.CourtDAO;
import uz.daba.gateway.models.ErrorBuilder;
import uz.daba.gateway.transports.court.BankruptArgument;
import uz.daba.gateway.transports.court.BaseCourtResult;
import uz.daba.gateway.transports.court.ReceiverInfoResult;
import uz.daba.gateway.transports.court.entities.BankruptcyTrusteeEntity;
import uz.daba.gateway.transports.court.entities.NonMaterialRequirementEntity;
import uz.daba.gateway.transports.court.entities.PayableEntity;
import uz.daba.gateway.utils.AppUtils;
import uz.daba.gateway.utils.Utils;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.Map;
import java.util.ResourceBundle;


@Path(UriCourt.COURT)
//@Tag(name = UriCourt.COURT)
public class CourtResource {
    private static Logger _logger = LogManager.getLogger(CourtResource.class);

    @Inject
    protected ResourceBundle rb;


    @Inject
    SqlSessionFactory db;


    private CourtDAO dao = new CourtDAO();


    @GET
    @Path(UriCourt.RECEIVER_INFO)
    @Produces({MediaType.APPLICATION_JSON})
    public Response getInfo(@Context UriInfo uriInfo
            , @QueryParam("pseria") String param) {

        if (StringUtils.isEmpty(param)) {
            return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.ERROR_DATA_REQUEST).build();
        }

        try (SqlSession sqlSession = db.openSession()) {
            ReceiverInfoResult result;

            result = AppUtils.getReceverInfoResult("passport_number", param, sqlSession);
            if (result != null) {
                result.setResult_code(1);
                result.setResult_message(rb.getString("success"));
                return Utils.toResponse(result);
            }

            if (StringUtils.isNumeric(param)) {
                result = AppUtils.getReceverInfoResult("pnfl", param, sqlSession);
                if (result != null) {
                    result.setResult_code(1);
                    result.setResult_message(rb.getString("success"));
                    return Utils.toResponse(result);
                }
            }

            result = AppUtils.getReceverInfoResult("attestat_number", param, sqlSession);
            if (result != null) {
                result.setResult_code(AConst.SUCCESS);
                result.setResult_message(rb.getString(AConst.SUCCESS_MESSAGE));
                return Utils.toResponse(result);
            }
            return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DATA_NOT_FOUND).build();

        } catch (Exception ex) {
            _logger.error(ex.getMessage());
            return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
        }
    }

    @POST
    @Path(UriCourt.BANKRUP)
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})

    public Response setBankrupData(BankruptArgument argument) {

        if (argument == null) {
            return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.ERROR_DATA_REQUEST).build();
        }
        SqlSession sqlSession = db.openSession(false);
        try {
            BaseCourtResult result = new BaseCourtResult();
            if (argument.getClaimId() == null) {
                return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DATA_NOT_FOUND).build();
            }


            Map<String, Object> mData = dao.insertBankrupData(sqlSession, argument, null);
            if (Utils.isNotSuccess(mData)) {
                sqlSession.rollback();
                return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
            }
            Integer newId = Utils.getNewId(mData);


            if (argument.getDecisionFile() != null) {
                byte[] fileDecode = Base64.decodeBase64(argument.getDecisionFile());
                long fileSize = AppUtils.saveFile(fileDecode, newId, argument.getClaimId().toString());

                if (fileSize == 0) {
                    sqlSession.rollback();
                    return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.ERROR_DATA_REQUEST).build();
                }

                Map<String, Object> mFile = dao.insertCourtFile(sqlSession, newId, fileSize);
                if (Utils.isNotSuccess(mFile)) {
                    sqlSession.rollback();
                    return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
                }


            }

            Map<String, Object> mClaimant = dao.insertBankrupClaimant(sqlSession, newId, argument.getClaimant(), argument.getClaimId());
            if (Utils.isNotSuccess(mClaimant)) {
                sqlSession.rollback();
                return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
            }

            Map<String, Object> mDef = dao.insertBankrupDefendant(sqlSession, newId, argument.getDefendant(), argument.getClaimId());
            if (Utils.isNotSuccess(mDef)) {
                sqlSession.rollback();
                return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
            }
            if (argument.getRepresentingOrg() != null) {
                Map<String, Object> mRep = dao.insertBankrupRepresentor(sqlSession, newId, argument.getRepresentingOrg(), argument.getClaimId());
                if (Utils.isNotSuccess(mRep)) {
                    sqlSession.rollback();
                    return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
                }
            }
            if (argument.getBankruptcyTrustee() != null && argument.getBankruptcyTrustee().size() > 0) {
                for (BankruptcyTrusteeEntity entity : argument.getBankruptcyTrustee()) {

                    Map<String, Object> mTrue = dao.insertBankrupTrustee(sqlSession, newId, entity, argument.getClaimId());
                    if (Utils.isNotSuccess(mTrue)) {
                        sqlSession.rollback();
                        return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
                    }
                }
            }
            if (argument.getPayable() != null && argument.getPayable().size() > 0) {
                for (PayableEntity payableEntity : argument.getPayable()) {
                    Map<String, Object> mPay = dao.insertPayable(sqlSession, newId, payableEntity, argument.getClaimId());
                    if (Utils.isNotSuccess(mPay)) {
                        sqlSession.rollback();
                        return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
                    }
                }
            }
            if (argument.getNonMaterialRequirement() != null && argument.getNonMaterialRequirement().size() > 0) {
                for (NonMaterialRequirementEntity nonMaterialRequirementEntity : argument.getNonMaterialRequirement()) {
                    Map<String, Object> mMat = dao.insertNonMaterialRequirement(sqlSession, newId, nonMaterialRequirementEntity, argument.getClaimId());
                    if (Utils.isNotSuccess(mMat)) {
                        sqlSession.rollback();
                        return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
                    }
                }
            }


            sqlSession.commit();

            result.setResult_code(AConst.SUCCESS);
            result.setResult_message(rb.getString(AConst.SUCCESS_MESSAGE));
            return Utils.toResponse(result);


        } catch (Exception ex) {
            sqlSession.rollback();
            _logger.error(ex.getMessage());
            return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
        } finally {
            sqlSession.close();
        }
    }
}
