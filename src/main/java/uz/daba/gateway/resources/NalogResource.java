package uz.daba.gateway.resources;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.daba.gateway.constants.urls.UriCourt;
import uz.daba.gateway.dao.NalogDAO;
import uz.daba.gateway.transports.nalog.BaseNalogResult;
import uz.daba.gateway.transports.nalog.OrgDebtArgument;
import uz.daba.gateway.transports.nalog.OrgSectionTaxArgument;
import uz.daba.gateway.transports.nalog.PostupArgument;
import uz.daba.gateway.utils.CustomException;
import uz.daba.gateway.utils.Utils;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;
import java.util.ResourceBundle;

@Path(UriCourt.NALOG)
public class NalogResource {

    private static Logger _logger = LogManager.getLogger(NalogResource.class);

    @Inject
    protected ResourceBundle rb;


    @Inject
    SqlSessionFactory db;


    private NalogDAO dao = new NalogDAO();

    @POST
    @Path(UriCourt.ORG_DEBT)
    @Produces({MediaType.APPLICATION_JSON})
    public Response saveData(String json) {
        _logger.info("Nalog Params :" + json);
        SqlSession sqlSession = db.openSession(false);
        BaseNalogResult result = new BaseNalogResult();
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            OrgDebtArgument argument = mapper.readValue(json, OrgDebtArgument.class);
            try {
                Map<String, Object> mData = dao.insertOrgDebt(sqlSession, argument);
                if (Utils.isNotSuccess(mData)) {
                    throw new CustomException();
                }
                result = new BaseNalogResult(1, rb.getString("nalog_success"));
            } catch (CustomException ex) {
                sqlSession.rollback();
                return Response.status(-1).entity(result).type(MediaType.APPLICATION_JSON).build();
            }
            sqlSession.commit();
            return Utils.toResponse(result);

        } catch (Exception ex) {
            _logger.error(ex);
            sqlSession.rollback();
            return Response.status(2).entity(result).type(MediaType.APPLICATION_JSON).build();
        } finally {
            sqlSession.close();
        }
    }


    @POST
    @Path(UriCourt.POSTUP)
    @Produces({MediaType.APPLICATION_JSON})
    public Response savePostup(String json) {
        _logger.info("Nalog Params :" + json);
        SqlSession sqlSession = db.openSession(false);
        BaseNalogResult result = new BaseNalogResult();
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            PostupArgument argument = mapper.readValue(json, PostupArgument.class);
            try {
                Map<String, Object> mData = dao.insertPostup(sqlSession, argument);
                if (Utils.isNotSuccess(mData)) {
                    throw new CustomException();
                }
                result = new BaseNalogResult(1, rb.getString("nalog_success"));
            } catch (CustomException ex) {
                sqlSession.rollback();
                return Response.status(-1).entity(result).type(MediaType.APPLICATION_JSON).build();
            }
            sqlSession.commit();
            return Utils.toResponse(result);

        } catch (Exception ex) {
            _logger.error(ex);
            sqlSession.rollback();
            return Response.status(101).entity(result).type(MediaType.APPLICATION_JSON).build();
        } finally {
            sqlSession.close();
        }
    }


    @POST
    @Path(UriCourt.SECTION_TAX)
    @Produces({MediaType.APPLICATION_JSON})
    public Response saveTax(String json) {
        _logger.info("Nalog Params :" + json);
        SqlSession sqlSession = db.openSession(false);
        BaseNalogResult result = new BaseNalogResult();
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            OrgSectionTaxArgument argument = mapper.readValue(json, OrgSectionTaxArgument.class);
            try {
                Map<String, Object> mData = dao.insertSectionTax(sqlSession, argument);
                if (Utils.isNotSuccess(mData)) {
                    throw new CustomException();
                }
                result = new BaseNalogResult(1, rb.getString("nalog_success"));
            } catch (CustomException ex) {
                sqlSession.rollback();
                return Response.status(-1).entity(result).type(MediaType.APPLICATION_JSON).build();
            }
            sqlSession.commit();
            return Utils.toResponse(result);

        } catch (Exception ex) {
            _logger.error(ex);
            sqlSession.rollback();
            return Response.status(2).entity(result).type(MediaType.APPLICATION_JSON).build();
        } finally {
            sqlSession.close();
        }
    }
}
