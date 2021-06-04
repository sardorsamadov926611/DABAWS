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
import uz.daba.gateway.dao.AuctionDAO;
import uz.daba.gateway.models.ErrorBuilder;
import uz.daba.gateway.transports.auction.BaseAuctionResult;
import uz.daba.gateway.utils.Utils;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.Map;
import java.util.ResourceBundle;

@Path(UriCourt.AUCTION)
public class AuctionResource {
    private static Logger _logger = LogManager.getLogger(AuctionResource.class);

    @Inject
    protected ResourceBundle rb;

    @Inject
    protected Client client;

    @Inject
    SqlSessionFactory db;
    private AuctionDAO dao = new AuctionDAO();

    @POST
    @Path(UriCourt.SELL_DATA)
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response setBankrupData(@Context UriInfo uriInfo
            , @QueryParam("order_id") Integer orderId) {
        BaseAuctionResult result = new BaseAuctionResult();

        if (orderId == null) {
            return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.ERROR_DATA_REQUEST).build();
        }
        try (SqlSession sqlSession = db.openSession()) {

            Map<String, Object> mData = dao.insertOrderId(sqlSession, orderId);

            if (Utils.isNotSuccess(mData)) {
                sqlSession.rollback();
                return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
            }
            Integer newId = Utils.getNewId(mData);


//            WebTarget target = client.target("adasd")
//                    .path("get-data")
//                    .queryParam("order_id", orderId);
//
//            Response resp = target.request(MediaType.APPLICATION_JSON_TYPE)
//                    .header("Authorization", AppUtils.headerAuth("login", "parol"))
//                    .get();
//
//            AppUtils.checkResponseStatusOrThrow(resp);
//
//            SellDataArgument argument = resp.readEntity(SellDataArgument.class);
//            if (result == null) {
//                throw new CustomException(resp.getStatusInfo().getReasonPhrase());
//            }


        } catch (Exception ex) {
            _logger.error(ex.getMessage());
            return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
        }


        result.setResult_code(AConst.SUCCESS);
        result.setResult_message(rb.getString(AConst.SUCCESS_MESSAGE));
        return Utils.toResponse(result);


    }

    private ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }
}
