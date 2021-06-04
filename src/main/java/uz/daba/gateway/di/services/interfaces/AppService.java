package uz.daba.gateway.di.services.interfaces;

public interface AppService {

    boolean checkUserAccessing(Integer userId, String actionName);
}
