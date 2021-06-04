package uz.daba.gateway.di.filters;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.daba.gateway.beans.UserAuthBean;
import uz.daba.gateway.constants.AConst;
import uz.daba.gateway.constants.ErrorEnum;
import uz.daba.gateway.models.ErrorBuilder;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.net.URI;
import java.util.*;

@Provider
@Priority(value = 4)
public class AuthenticationFilter implements ContainerRequestFilter {
    private static Logger _logger = LogManager.getLogger(AuthenticationFilter.class);


    @Context
    ResourceInfo resourceInfo;

    @Inject
    ResourceBundle rb;

    @Inject
    SqlSessionFactory db;


    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        URI baseUri = requestContext.getUriInfo().getBaseUri();
        if (baseUri.getHost().equals("localhost") && baseUri.getPort() == 8083) {
            return;
        }

        String authorizationHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
        if (authorizationHeader != null && authorizationHeader.startsWith("Basic ")) {
            String auth = new String(Base64.decodeBase64(authorizationHeader.substring(6)));
            String[] split = auth.split(":");
            String login = split[0];
            String password = split[1];

            if (StringUtils.isEmpty(login)) {
                requestContext.abortWith(ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.USER_LOGIN_NOT_FOUND).build());
                return;
            }
            if (StringUtils.isEmpty(password)) {
                requestContext.abortWith(ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.USER_PASSWORD_NOT_FOUND).build());
                return;
            }
            handleBasicAuthentication(login, password, requestContext);

        } else {
            requestContext.abortWith(ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.USER_LOGIN_PASSWORD_NOT_FOUND).build());
        }

    }

    private void handleBasicAuthentication(String login, String password, ContainerRequestContext requestContext) {
        List<UserAuthBean> usersList;
        UserAuthBean user = null;

        try (SqlSession sqlSession = db.openSession()) {

            Map<String, Object> m1 = new HashMap<>();
            m1.put("login", login);
            m1.put("password", password);
            m1.put("type_id", AConst.TYPE_ID);
            usersList = sqlSession.selectList("selectQueryOrgs", m1);
            if (usersList.size() > 1 || usersList.size() == 0) {
                requestContext.abortWith(ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.USER_NOT_FOUND).build());
                return;
            }

            user = usersList.get(0);
            if (user.getStatus() == null || user.getStatus() == 0) {
                requestContext.abortWith(ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.USER_STATE_DISABLED).build());
                return;
            }

        } catch (Exception ex) {
            _logger.error(ex);
            requestContext.abortWith(ErrorBuilder.newInstance(rb).ERROR(ErrorEnum.DB_NOT_AVAILABLE).build());
            return;
        }

    }


}
