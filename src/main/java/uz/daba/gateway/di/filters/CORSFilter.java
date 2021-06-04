package uz.daba.gateway.di.filters;


import uz.daba.gateway.models.CorsProperties;

import javax.ws.rs.container.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
@PreMatching
public class CORSFilter implements ContainerRequestFilter, ContainerResponseFilter {

    private CorsProperties corsProperties = new CorsProperties();

    private static boolean isPreFlightRequest(ContainerRequestContext request) {
        return request.getHeaderString("Origin") != null
                && request.getMethod().equalsIgnoreCase("OPTIONS");
    }

    @Override
    public void filter(ContainerRequestContext request) throws IOException {
        if (isPreFlightRequest(request)) {
            request.abortWith(Response.ok().build());
        }
    }

    @Override
    public void filter(ContainerRequestContext request, ContainerResponseContext response)
            throws IOException {

        if (request.getHeaderString("Origin") == null) {
            return;
        }

        if (isPreFlightRequest(request)) {
            response.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD");
            response.getHeaders().add("Access-Control-Allow-Headers", "X-Requested-With, Authorization, Accept-Version, Content-MD5, CSRF-Token, content-type");
        }
//        response.getHeaders().add("Access-Control-Allow-Origin", "http://localhost:8081 http://localhost:8082 http://localhost:8083");
//        response.getHeaders().add("Access-Control-Allow-Origin", "http://localhost:8080");
        response.getHeaders().add("Access-Control-Allow-Origin", corsProperties.getConfig().getString("cors.url"));
//        response.getHeaders().add("Access-Control-Allow-Origin", "*");
        response.getHeaders().add("Access-Control-Allow-Credentials", "true");
    }

}
