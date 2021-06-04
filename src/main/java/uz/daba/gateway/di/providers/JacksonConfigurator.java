package uz.daba.gateway.di.providers;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.Produces;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.text.SimpleDateFormat;

@Provider
@Produces("application/json")
public class JacksonConfigurator implements ContextResolver<ObjectMapper> {
    private ObjectMapper mapper = new ObjectMapper();


    public JacksonConfigurator() {
        mapper.setDateFormat(new SimpleDateFormat("dd.MM.yyyy"));
    }

    @Override
    public ObjectMapper getContext(Class<?> arg0) {
        return mapper;
    }
}
