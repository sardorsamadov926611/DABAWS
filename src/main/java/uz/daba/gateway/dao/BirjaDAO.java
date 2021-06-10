package uz.daba.gateway.dao;

import org.apache.ibatis.session.SqlSession;
import uz.daba.gateway.transports.birja.BExchangeInfoArgument;
import uz.daba.gateway.transports.birja.BProcurementInfoArgument;

import java.util.HashMap;
import java.util.Map;

public class BirjaDAO {


    public Map<String, Object> insertInfoPro(SqlSession sqlSession, BProcurementInfoArgument argument) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_type", argument.getType());
        map.put("p_lot_id", argument.getLot_id());
        map.put("p_start_date", argument.getStart_date());
        map.put("p_end_date", argument.getEnd_date());
        map.put("p_deal_id", argument.getDeal_id());
        map.put("p_deal_date", argument.getDeal_date());
        map.put("p_count_orders", argument.getCount_orders());
        map.put("p_category_id", argument.getCategory_id());
        map.put("p_product_name", argument.getProduct_name());
        map.put("p_amount", argument.getAmount());
        map.put("p_unit", argument.getUnit());
        map.put("p_one_price", argument.getOne_price());
        map.put("p_base_price", argument.getBase_price());
        map.put("p_country_id", argument.getCountry_id());
        map.put("p_deal_price", argument.getDeal_price());
        map.put("p_buyer_name", argument.getBuyer_name());
        map.put("p_buyer_tin", argument.getBuyer_tin());
        map.put("p_buyer_id", argument.getBuyer_id());
        map.put("p_provider_name", argument.getProvider_name());
        map.put("p_provider_tin", argument.getProvider_tin());
        map.put("p_provider_id", argument.getProvider_id());
        map.put("p_founder_fio", argument.getFounder_fio());
        map.put("p_benefit_fio", argument.getBenefit_fio());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("create_birja_info_procurement", map);
        return map;
    }

    public Map<String, Object> insertInfoExchange(SqlSession sqlSession, BExchangeInfoArgument argument) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_sellerName", argument.getSellerName());
        map.put("p_sellerInn", argument.getSellerInn());
        map.put("p_nameCommod", argument.getNameCommod());
        map.put("p_unit", argument.getUnit());
        map.put("p_baseAmount", argument.getBaseAmount());
        map.put("p_dealAmount", argument.getDealAmount());
        map.put("p_avgPrice", argument.getAvgPrice());
        map.put("p_dealSum", argument.getDealSum());
        map.put("p_period", argument.getPeriod());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("create_birja_info_exchange", map);
        return map;
    }


}
