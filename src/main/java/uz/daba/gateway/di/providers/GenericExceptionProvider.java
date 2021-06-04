package uz.daba.gateway.di.providers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.daba.gateway.models.ErrorMsg;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionProvider implements ExceptionMapper<Throwable> {
    private static Logger _logger = LogManager.getLogger(GenericExceptionProvider.class);

    @Override
    public Response toResponse(Throwable ex) {
        _logger.error(ex.getMessage(), ex);

        Response.StatusType type = getStatusType(ex);

        ErrorMsg error = new ErrorMsg(
                type.getStatusCode(),
                type.getReasonPhrase());

        return Response.status(error.getResult_code())
                .entity(error)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }


    private Response.StatusType getStatusType(Throwable ex) {

        if (ex instanceof WebApplicationException) {
            return ((WebApplicationException) ex).getResponse().getStatusInfo();
        } else {
            return Response.Status.INTERNAL_SERVER_ERROR;
        }
    }
}
