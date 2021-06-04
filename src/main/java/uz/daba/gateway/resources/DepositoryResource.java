package uz.daba.gateway.resources;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.daba.gateway.constants.AConst;
import uz.daba.gateway.constants.ErrorEnum;
import uz.daba.gateway.constants.urls.UriCourt;
import uz.daba.gateway.dao.DepositoryDAO;
import uz.daba.gateway.models.ErrorBuilder;
import uz.daba.gateway.transports.court.BaseCourtResult;
import uz.daba.gateway.transports.depozit.DepIteam1Entity;
import uz.daba.gateway.transports.depozit.DepIteam2Entity;
import uz.daba.gateway.transports.depozit.DepIteam3Entity;
import uz.daba.gateway.transports.depozit.DepozitArgument;
import uz.daba.gateway.utils.Utils;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TimeZone;

@Path(UriCourt.DEPOSITORY)
public class DepositoryResource {

    private static Logger _logger = LogManager.getLogger(DepositoryResource.class);

    @Inject
    protected ResourceBundle rb;


    @Inject
    SqlSessionFactory db;

    private DepositoryDAO dao = new DepositoryDAO();

    @POST
    @Path(UriCourt.DEPOSITORY_SEND_INFO)
    @Produces({MediaType.APPLICATION_JSON})
    public Response saveData(String json) {

        BaseCourtResult result = new BaseCourtResult();
        SqlSession sqlSession = db.openSession(false);

        try {

            ObjectMapper mapper = new ObjectMapper();
            mapper.setTimeZone(TimeZone.getDefault());
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            DepozitArgument dataObj = mapper.readValue(json, DepozitArgument.class);

            Map<String, Object> mData = dao.insertContent(sqlSession, dataObj.getName(), dataObj.getDate());
            if (Utils.isNotSuccess(mData)) {
                sqlSession.rollback();
                return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
            }
            Integer newId = Utils.getNewId(mData);

            if (newId == null) {
                sqlSession.rollback();
                return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
            }


            for (DepIteam1Entity entity : dataObj.getItem1()) {
                Map<String, Object> mData1 = dao.insertItem1(sqlSession, entity, newId);
                if (Utils.isNotSuccess(mData1)) {
                    sqlSession.rollback();
                    return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
                }
            }

            for (DepIteam2Entity entity : dataObj.getItem2()) {
                Map<String, Object> mData2 = dao.insertItem2(sqlSession, entity, newId);
                if (Utils.isNotSuccess(mData2)) {
                    sqlSession.rollback();
                    return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
                }
            }
            for (DepIteam3Entity entity : dataObj.getItem3()) {
                Map<String, Object> mData3 = dao.insertItem3(sqlSession, entity, newId);
                if (Utils.isNotSuccess(mData3)) {
                    sqlSession.rollback();
                    return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
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
