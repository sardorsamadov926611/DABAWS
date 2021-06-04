package uz.daba.gateway.di.factories;

import org.glassfish.hk2.api.Factory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleFactory implements Factory<ResourceBundle> {

    private final HttpServletRequest request;

    @Inject
    public ResourceBundleFactory(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public ResourceBundle provide() {
        HttpSession httpSession = request.getSession();

        String locale = "RU";

        return ResourceBundle.getBundle("Application", new Locale(locale.toLowerCase()));
    }

    @Override
    public void dispose(ResourceBundle instance) {

    }
}
