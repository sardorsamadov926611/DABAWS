package uz.daba.gateway.resources;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.daba.gateway.constants.urls.UriCourt;
import uz.daba.gateway.dao.CustomDAO;
import uz.daba.gateway.transports.custom.*;
import uz.daba.gateway.utils.CustomException;
import uz.daba.gateway.utils.Utils;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.ResourceBundle;


@Path(UriCourt.CUSTOM)
public class CustomResource {
    private static Logger _logger = LogManager.getLogger(CustomResource.class);


    @Inject
    protected ResourceBundle rb;


    @Inject
    SqlSessionFactory db;

    private CustomDAO dao = new CustomDAO();

    @POST
    @Path(UriCourt.SEND_INFO)
    @Produces({MediaType.APPLICATION_JSON})
    public Response saveData(String json) {
        CustomResult result = new CustomResult();
        _logger.info("Custom Params :" + json);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SqlSession sqlSession = db.openSession(false);
        try {


            ObjectMapper mapper = new ObjectMapper();
//            mapper.setTimeZone(TimeZone.getDefault());
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            BaseCustomArgument dataObj = mapper.readValue(json, BaseCustomArgument.class);

            DeclarationEntity entity = dataObj.getGTDInformation().getDeclarationdata();

            try {
                Map<String, Object> mData = dao.insertDeclarationData(sqlSession, entity, dataObj.getGTDInformation().getInformation_date());
                if (Utils.isNotSuccess(mData)) {
                    throw new CustomException();
                }
                Integer newId = Utils.getNewId(mData);
                for (DeclarationItemEntity itemEntity : entity.getTovar()) {
                    Map<String, Object> mItem = dao.insertTovarData(sqlSession, newId, itemEntity);
                    if (Utils.isNotSuccess(mItem)) {
                        throw new CustomException();
                    }
                }

                CustomResultItem item = new CustomResultItem(entity, rb.getString("success"));
                item.setId_org(newId.toString());
                item.setReceive_time_org(mData.get("p_created_date").toString());
                result.setResult(item);

            } catch (CustomException ex) {
                sqlSession.rollback();
                result.setResult(new CustomResultItem(entity, rb.getString("error.create_data")));
                return Response.status(Response.Status.BAD_REQUEST).entity(result).type(MediaType.APPLICATION_JSON).build();
            }

            sqlSession.commit();
            return Utils.toResponse(result);

        } catch (Exception ex) {
            _logger.error(ex);
            sqlSession.rollback();
            result.setResult(new CustomResultItem(new DeclarationEntity(), rb.getString("error.create_data")));
            return Response.status(Response.Status.BAD_REQUEST).entity(result).type(MediaType.APPLICATION_JSON).build();
        } finally {
            sqlSession.close();
        }

    }

    @POST
    @Path(UriCourt.SEND_WARE_HOUSE)
    @Produces({MediaType.APPLICATION_JSON})
    public Response saveWareHouseData(String json) {
        CustomWareResult result = new CustomWareResult();
//        _logger.info("Custom Params :" + json);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String id = "";
        SqlSession sqlSession = db.openSession(false);
        try {


            ObjectMapper mapper = new ObjectMapper();
//            mapper.setTimeZone(TimeZone.getDefault());
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            BaseWareHouseCustomArgument dataObj = mapper.readValue(json, BaseWareHouseCustomArgument.class);
            BaseCustomWareHouseEntity baseData = dataObj.getInformation();
            id = baseData.getId();


            try {
                Map<String, Object> mData = dao.insertWareHouseData(sqlSession, baseData.getId(), baseData.getInformation_date());
                if (Utils.isNotSuccess(mData)) {
                    throw new CustomException();
                }
                Integer newId = Utils.getNewId(mData);
                for (WareHouseDataEntity itemEntity : baseData.getWareHouseDataEntity()) {
                    Map<String, Object> mItem = dao.insertWareHouseItemTovarData(sqlSession, newId, itemEntity);
                    if (Utils.isNotSuccess(mItem)) {
                        throw new CustomException();
                    }
                }
                CustomWareHouseResultItem item = new CustomWareHouseResultItem(baseData.getId(), "" + newId, rb.getString("success"));
                item.setId_org(newId.toString());
                result.setResult(item);
            } catch (CustomException ex) {
                sqlSession.rollback();
                result.setResult(new CustomWareHouseResultItem(baseData.getId(), "", rb.getString("error.system")));
                return Response.status(Response.Status.BAD_REQUEST).entity(result).type(MediaType.APPLICATION_JSON).build();
            }

            sqlSession.commit();
            return Utils.toResponse(result);

        } catch (Exception ex) {
            _logger.error(ex);
            sqlSession.rollback();
            result.setResult(new CustomWareHouseResultItem(id, "", rb.getString("error.system")));
            return Response.status(Response.Status.BAD_REQUEST).entity(result).type(MediaType.APPLICATION_JSON).build();
        } finally {
            sqlSession.close();
        }

    }

}
