package uz.daba.gateway.resources;


import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.daba.gateway.constants.AConst;
import uz.daba.gateway.constants.ErrorEnum;
import uz.daba.gateway.constants.urls.UriCourt;
import uz.daba.gateway.models.ErrorBuilder;
import uz.daba.gateway.transports.government.GovInfoBean;
import uz.daba.gateway.transports.government.GovernmentInfoResult;
import uz.daba.gateway.utils.Utils;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Path(UriCourt.GOVERMENT)
public class GovermentResource {

    private static Logger _logger = LogManager.getLogger(GovermentResource.class);

    @Inject
    protected ResourceBundle rb;


    @Inject
    SqlSessionFactory db;

    @GET
    @Path(UriCourt.OBJECT_INFO)
    @Produces({MediaType.APPLICATION_JSON})
    public Response getInfo(@Context UriInfo uriInfo
            , @QueryParam("last_update_datetime") String param) {

        if (StringUtils.isEmpty(param)) {
            return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.ERROR_DATA_REQUEST).build();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-mm HH:mm:ss");

        try {
            Date paramDate = sdf.parse(param);
        } catch (ParseException e) {
            return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.ERROR_DATA_REQUEST).build();
        }

        try (SqlSession sqlSession = db.openSession()) {
            GovernmentInfoResult result = new GovernmentInfoResult();

            Map<String, Object> m = new HashMap<>();
            m.put("last_updated_date", param);
            List<GovInfoBean> list = sqlSession.selectList("selectGovInfo", m);
            if (list.isEmpty()) {
                return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DATA_NOT_FOUND).build();
            }
            result.setInfos(list);
            result.setResult_code(AConst.SUCCESS);
            result.setResult_message(rb.getString(AConst.SUCCESS_MESSAGE));
            return Utils.toResponse(result);

        } catch (Exception ex) {
            _logger.error(ex.getMessage());
            return ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build();
        }
    }
}
