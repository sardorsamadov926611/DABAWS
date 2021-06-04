package uz.daba.gateway.di.factories;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.glassfish.hk2.api.Factory;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class JerseyClientFactory implements Factory<Client> {

    private static Logger logger = LogManager.getLogger(JerseyClientFactory.class);

    @Override
    public Client provide() {
        ClientConfig config = new ClientConfig();

        JacksonJsonProvider jsonProvider =
                new JacksonJaxbJsonProvider(objectMapper(), JacksonJaxbJsonProvider.DEFAULT_ANNOTATIONS)
                        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        config.register(jsonProvider);

        /* Empty client */
        return ClientBuilder.newBuilder()
                .withConfig(config)
                .build();
    }

    @Override
    public void dispose(Client instance) {

    }

    private ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode options = JsonNodeFactory.instance.objectNode();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }
}
