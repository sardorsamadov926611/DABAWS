package uz.daba.gateway;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import uz.daba.gateway.di.AppBinder;
import uz.daba.gateway.di.filters.BaseFilter;
import uz.daba.gateway.di.providers.BaseProvider;
import uz.daba.gateway.resources.BaseResource;

import javax.ws.rs.ApplicationPath;

//@ApplicationPath("api")
public class Application extends ResourceConfig {


    public Application() {

          /*
        Binders
         */
        register(new AppBinder());

        /*
        Packages
         */
        packages(
                /* Resources */
                BaseResource.class.getPackage().getName(),

                /* Filters */
                BaseFilter.class.getPackage().getName(),

                /* Mappers */
                BaseProvider.class.getPackage().getName()

        );

          /*
        Features
         */
        register(JacksonFeature.class);

        register(MultiPartFeature.class);
    }
}
