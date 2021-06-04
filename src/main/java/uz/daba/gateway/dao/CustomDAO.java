package uz.daba.gateway.dao;

import org.apache.ibatis.session.SqlSession;
import uz.daba.gateway.transports.custom.DeclarationEntity;
import uz.daba.gateway.transports.custom.DeclarationItemEntity;
import uz.daba.gateway.transports.custom.WareHouseDataEntity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CustomDAO {


    public Map<String, Object> insertDeclarationData(SqlSession sqlSession, DeclarationEntity argument, Date informDate) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_gtk_id", argument.getId());
        map.put("p_inform_date", informDate);
        map.put("p_request_number", argument.getG7_a());
        map.put("p_request_date", argument.getG7_b());
        map.put("p_gtk_number", argument.getG7_c());
        map.put("p_declaration_type", argument.getG1_a());
        map.put("p_gtk_mode_number", argument.getG1_b());
        map.put("p_shipper_name", argument.getG2_name());
        map.put("p_shipper_inn", argument.getG2_code2());
        map.put("p_shipper_address", argument.getG2_address());
        map.put("p_receiver_name", argument.getG8_name());
        map.put("p_receiver_inn", argument.getG8_code2());
        map.put("p_receiver_address", argument.getG8_address());
        map.put("p_new_id", null);
        map.put("p_created_date", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("create_custom_declaration", map);
        return map;
    }


    public Map<String, Object> insertTovarData(SqlSession sqlSession, Integer newId, DeclarationItemEntity argument) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_product_number", argument.getG32());
        map.put("p_product_name", argument.getG31_name());
        map.put("p_tnv_code", argument.getG33());
        map.put("p_weight", argument.getG38());
        map.put("p_amount", argument.getG31_amount());
        map.put("p_measure", argument.getG41());
        map.put("p_statistical_cost", argument.getG46());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("create_custom_product", map);
        return map;
    }


    public Map<String, Object> insertWareHouseData(SqlSession sqlSession, String id, Date informDate) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", id);
        map.put("p_inform_date", informDate);
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("create_custom_warehouse_data", map);
        return map;
    }

    public Map<String, Object> insertWareHouseItemTovarData(SqlSession sqlSession, Integer newId, WareHouseDataEntity argument) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_licen_number", argument.getLicen_number());
        map.put("p_name", argument.getName());
        map.put("p_receiver_name", argument.getReceiver_name());
        map.put("p_inn", argument.getInn());
        map.put("p_type_gtk", argument.getType_gtk());
        map.put("p_number_custom", argument.getNumber_custom());
        map.put("p_post_number", argument.getPost_number());
        map.put("p_date_gtk", argument.getDate_gtk());
        map.put("p_number_gtk", argument.getNumber_gtk());
        map.put("p_tnv_code", argument.getTnv_code());
        map.put("p_tovar_name", argument.getTovar_name());
        map.put("p_static_cost", argument.getStatic_cost());
        map.put("p_balance_weight", argument.getBalance_weight());
        map.put("p_flag", argument.getFlag());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("create_custom_warehouse_data_item", map);
        return map;
    }


}
