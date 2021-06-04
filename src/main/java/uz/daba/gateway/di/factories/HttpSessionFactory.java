package uz.daba.gateway.di.factories;

import org.glassfish.hk2.api.Factory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Context;

public class HttpSessionFactory implements Factory<HttpSession> {

    @Context
    HttpServletRequest request;

    public HttpSessionFactory() {
    }

    @Override
    public HttpSession provide() {
        return request.getSession();
    }

    @Override
    public void dispose(HttpSession httpSession) {

    }
}