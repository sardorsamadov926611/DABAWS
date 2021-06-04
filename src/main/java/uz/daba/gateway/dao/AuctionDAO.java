package uz.daba.gateway.dao;

import org.apache.ibatis.session.SqlSession;
import uz.daba.gateway.transports.court.BankruptArgument;
import uz.daba.gateway.transports.court.entities.BankruptcyTrusteeEntity;
import uz.daba.gateway.transports.court.entities.ClaimantEntity;
import uz.daba.gateway.transports.court.entities.DefendantEntity;
import uz.daba.gateway.transports.court.entities.RepresentorEntity;

import java.util.HashMap;
import java.util.Map;

public class AuctionDAO {

    public Map<String, Object> insertOrderId(SqlSession sqlSession, Integer orderId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_order_id", orderId);
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_auction_order", map);
        return map;
    }


}
