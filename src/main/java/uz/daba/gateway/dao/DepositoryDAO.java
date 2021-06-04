package uz.daba.gateway.dao;

import org.apache.ibatis.session.SqlSession;
import uz.daba.gateway.transports.depozit.DepIteam1Entity;
import uz.daba.gateway.transports.depozit.DepIteam2Entity;
import uz.daba.gateway.transports.depozit.DepIteam3Entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DepositoryDAO {

    public Map<String, Object> insertContent(SqlSession sqlSession,  String name, Date date) {
        Map<String, Object> map = new HashMap<>();
        map.put("p_name", name);
        map.put("p_date", date);
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_depository_content", map);
        return map;
    }
    public Map<String, Object> insertItem1(SqlSession sqlSession, DepIteam1Entity argument, Integer newId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_n", argument.getN());
        map.put("p_tin", argument.getTin());
        map.put("p_issr_nm", argument.getIssr_nm());
        map.put("p_opf", argument.getOpf());
        map.put("p_nopf", argument.getNopf());
        map.put("p_kfs", argument.getKfs());
        map.put("p_nkfs", argument.getNkfs());
        map.put("p_region", argument.getRegion());
        map.put("p_capital", argument.getCapital());
        map.put("p_pval", argument.getPval());
        map.put("p_current_stkqty", argument.getCurrent_stkqty());
        map.put("p_inn", argument.getInn());
        map.put("p_crp_nm", argument.getCrp_nm());
        map.put("p_opf_vl", argument.getOpf_vl());
        map.put("p_nopf_vl", argument.getNopf_vl());
        map.put("p_kfs_vl", argument.getKfs_vl());
        map.put("p_nkfs_vl", argument.getNkfs_vl());
        map.put("p_pers", argument.getPers());
        map.put("p_volum", argument.getVolum());
        map.put("p_tdy_qty", argument.getTdy_qty());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_depository_item1", map);
        return map;
    }


    public Map<String, Object> insertItem2(SqlSession sqlSession, DepIteam2Entity argument, Integer newId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_n", argument.getN());
        map.put("p_tin", argument.getTin());
        map.put("p_issr_nm_em", argument.getIssr_nm_em());
        map.put("p_opf", argument.getOpf());
        map.put("p_nopf", argument.getNopf());
        map.put("p_kfs", argument.getKfs());
        map.put("p_nkfs", argument.getNkfs());
        map.put("p_region", argument.getRegion());
        map.put("p_capital", argument.getCapital());
        map.put("p_pval", argument.getPval());
        map.put("p_stk_qty_em", argument.getStk_qty_em());
        map.put("p_inn", argument.getInn());
        map.put("p_crp_nm", argument.getCrp_nm());
        map.put("p_opf_vl", argument.getOpf_vl());
        map.put("p_nopf_vl", argument.getNopf_vl());
        map.put("p_kfs_vl", argument.getKfs_vl());
        map.put("p_nkfs_vl", argument.getNkfs_vl());
        map.put("p_pers_vl", argument.getPers_vl());
        map.put("p_volum_vl", argument.getVolum_vl());
        map.put("p_tdy_qty", argument.getTdy_qty());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_depository_item2", map);
        return map;
    }

    public Map<String, Object> insertItem3(SqlSession sqlSession, DepIteam3Entity argument, Integer newId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_nn", argument.getNn());
        map.put("p_inn", argument.getInn());
        map.put("p_crp_nm", argument.getCrp_nm());
        map.put("p_opf", argument.getOpf());
        map.put("p_nopf", argument.getNopf());
        map.put("p_kfs", argument.getKfs());
        map.put("p_nkfs", argument.getNkfs());
        map.put("p_pers", argument.getPers());
        map.put("p_volume", argument.getVolume());
        map.put("p_tdy_qty", argument.getTdy_qty());
        map.put("p_tin", argument.getTin());
        map.put("p_issr_nm", argument.getIssr_nm());
        map.put("p_opf_pr", argument.getOpf_pr());
        map.put("p_nopf_pr", argument.getNopf_pr());
        map.put("p_kfs_pr", argument.getKfs_pr());
        map.put("p_nkfs_pr", argument.getNkfs_pr());
        map.put("p_nregn_pr", argument.getNregn_pr());
        map.put("p_volume_pr", argument.getVolume_pr());
        map.put("p_pval", argument.getPval());
        map.put("p_current_stkqty", argument.getCurrent_stkqty());
        map.put("p_n", argument.getN());
        map.put("p_name_", argument.getName());
        map.put("p_nkfs_", argument.getNkfs_());
        map.put("p_nreestr", argument.getNreestr());
        map.put("p_date_", argument.getDate());
        map.put("p_inn_ooo", argument.getInn_ooo());
        map.put("p_okpo", argument.getOkpo());
        map.put("p_OOO_soogu", argument.getOOO_soogu());
        map.put("p_oked", argument.getOked());
        map.put("p_OOO_mfo", argument.getOOO_mfo());
        map.put("p_telno", argument.getTelno());
        map.put("p_fax", argument.getFax());
        map.put("p_email", argument.getEmail());
        map.put("p_ncsdp", argument.getNcsdp());
        map.put("p_OOO_region", argument.getOOO_region());
        map.put("p_adres", argument.getAdres());
        map.put("p_street", argument.getStreet());
        map.put("p_uchred", argument.getUchred());
        map.put("p_gos_pers", argument.getGos_pers());
        map.put("p_xzu_pers", argument.getXzu_pers());
        map.put("p_nsoogu", argument.getNsoogu());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_depository_item3", map);
        return map;
    }

}
