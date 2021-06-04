package uz.daba.gateway.di;

import org.apache.ibatis.session.SqlSessionFactory;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.process.internal.RequestScoped;
import uz.daba.gateway.di.factories.DBFactory;
import uz.daba.gateway.di.factories.HttpSessionFactory;
import uz.daba.gateway.di.factories.JerseyClientFactory;
import uz.daba.gateway.di.factories.ResourceBundleFactory;
import uz.daba.gateway.di.services.AppServiceImpl;
import uz.daba.gateway.di.services.DaoServiceImpl;
import uz.daba.gateway.di.services.interfaces.AppService;
import uz.daba.gateway.di.services.interfaces.DaoService;


import javax.inject.Singleton;
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.Client;
import java.util.ResourceBundle;

public class AppBinder extends AbstractBinder {

    /**
     * https://docs.huihoo.com/jersey/2.13/ioc.html
     */
    @Override
    protected void configure() {

        /*
        Factories
         */
        bindFactory(HttpSessionFactory.class).to(HttpSession.class).proxy(true).proxyForSameScope(false).in(RequestScoped.class);
        bindFactory(ResourceBundleFactory.class).to(ResourceBundle.class).proxy(true).proxyForSameScope(false).in(RequestScoped.class);
        bindFactory(DBFactory.class).to(SqlSessionFactory.class).proxy(true).proxyForSameScope(false).in(Singleton.class);
        bindFactory(JerseyClientFactory.class).to(Client.class).proxy(true).proxyForSameScope(false).in(RequestScoped.class);

        /*
        Services
         */
        bind(DaoServiceImpl.class).to(DaoService.class).proxy(true).proxyForSameScope(false).in(Singleton.class);
        bind(AppServiceImpl.class).to(AppService.class).proxy(true).proxyForSameScope(false).in(Singleton.class);
    }
}
