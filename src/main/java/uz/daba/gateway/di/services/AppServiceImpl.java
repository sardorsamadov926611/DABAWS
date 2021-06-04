package uz.daba.gateway.di.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.daba.gateway.di.services.interfaces.AppService;
import uz.daba.gateway.di.services.interfaces.DaoService;


import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

public class AppServiceImpl implements AppService {
    private static Logger _logger = LogManager.getLogger(AppServiceImpl.class);

    @Inject
    DaoService daoService;

    @Override
    public boolean checkUserAccessing(Integer userId, String actionName) {
        if (actionName == null || actionName.trim().length() == 0) {
            return true;
        }
        try {
            Map<String, Object> m = new HashMap<>();
            m.put("app_action_short_name", actionName);
            m.put("user_id", userId);
            Integer acc_id = daoService.getOne("CheckUserAccessing", m);
            return acc_id != null && acc_id == 1;

        } catch (Exception ex) {
            _logger.error(ex.getMessage());
            return false;
        }
    }
}
