package uz.daba.gateway.resources;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.daba.gateway.constants.urls.UriCourt;
import uz.daba.gateway.dao.BirjaDAO;
import uz.daba.gateway.transports.birja.BExchangeInfoArgument;
import uz.daba.gateway.transports.birja.BProcurementInfoArgument;
import uz.daba.gateway.transports.nalog.BaseNalogResult;
import uz.daba.gateway.utils.CustomException;
import uz.daba.gateway.utils.Utils;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

@Path(UriCourt.BIRJA)
public class BirjaResource {

    private static Logger _logger = LogManager.getLogger(BirjaResource.class);

    @Inject
    protected ResourceBundle rb;


    @Inject
    SqlSessionFactory db;


    private BirjaDAO dao = new BirjaDAO();

    @POST
    @Path(UriCourt.INFO_PROCUREMENT)
    @Produces({MediaType.APPLICATION_JSON})
    public Response saveData(String json) {
        _logger.info("Birja Params :" + json);
        SqlSession sqlSession = db.openSession(false);
        BaseNalogResult result = new BaseNalogResult();
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            List<BProcurementInfoArgument> arguments = mapper.readValue(json, new TypeReference<List<BProcurementInfoArgument>>() {
            });
            try {
                for (BProcurementInfoArgument argument : arguments) {
                    Map<String, Object> mData = dao.insertInfoPro(sqlSession, argument);
                    if (Utils.isNotSuccess(mData)) {
                        throw new CustomException();
                    }
                }
                result = new BaseNalogResult(1, rb.getString("nalog_success"));
            } catch (CustomException ex) {
                sqlSession.rollback();
                return Response.status(Response.Status.BAD_REQUEST).entity(result).type(MediaType.APPLICATION_JSON).build();
            }
            sqlSession.commit();
            return Utils.toResponse(result);

        } catch (Exception ex) {
            _logger.error(ex);
            sqlSession.rollback();
            return Response.status(Response.Status.BAD_REQUEST).entity(result).type(MediaType.APPLICATION_JSON).build();
        } finally {
            sqlSession.close();
        }
    }


    @POST
    @Path(UriCourt.INFO_EXCHANGE)
    @Produces({MediaType.APPLICATION_JSON})
    public Response saveExchange(String json) {
        _logger.info("Nalog Params :" + json);
        SqlSession sqlSession = db.openSession(false);
        BaseNalogResult result = new BaseNalogResult();
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            List<BExchangeInfoArgument> arguments = mapper.readValue(json, new TypeReference<List<BExchangeInfoArgument>>() {
            });
            try {
                for (BExchangeInfoArgument argument : arguments) {
                    Map<String, Object> mData = dao.insertInfoExchange(sqlSession, argument);
                    if (Utils.isNotSuccess(mData)) {
                        throw new CustomException();
                    }
                }
                result = new BaseNalogResult(1, rb.getString("nalog_success"));
            } catch (CustomException ex) {
                sqlSession.rollback();
                return Response.status(Response.Status.BAD_REQUEST).entity(result).type(MediaType.APPLICATION_JSON).build();
            }
            sqlSession.commit();
            return Utils.toResponse(result);

        } catch (Exception ex) {
            _logger.error(ex);
            sqlSession.rollback();
            return Response.status(Response.Status.BAD_REQUEST).entity(result).type(MediaType.APPLICATION_JSON).build();
        } finally {
            sqlSession.close();
        }
    }


}
