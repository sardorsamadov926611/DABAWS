package uz.daba.gateway.dao;

import org.apache.ibatis.session.SqlSession;
import uz.daba.gateway.transports.nalog.OrgDebtArgument;
import uz.daba.gateway.transports.nalog.OrgSectionTaxArgument;
import uz.daba.gateway.transports.nalog.PostupArgument;

import java.util.HashMap;
import java.util.Map;

public class NalogDAO {


    public Map<String, Object> insertOrgDebt(SqlSession sqlSession, OrgDebtArgument argument) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id_document", argument.getId_document());
        map.put("p_send_date", argument.getSend_date());
        map.put("p_name", argument.getName());
        map.put("p_ns10", argument.getNs10());
        map.put("p_ns11", argument.getNs11());
        map.put("p_address", argument.getAddress());
        map.put("p_is_yirik_taxpayer", argument.getYirik_taxpayer().equals("+") ? 1 : 0);
        map.put("p_tin", argument.getTin());
        map.put("p_activity_code", argument.getActivity_code());
        map.put("p_payed_taxes", argument.getPayed_taxes());
        map.put("p_nds", argument.getNds());
        map.put("p_aksiz", argument.getAksiz());
        map.put("p_dividend", argument.getDividend());
        map.put("p_others", argument.getOthers());
        map.put("p_main_debt", argument.getMain_debt());
        map.put("p_main_debt_3", argument.getMain_debt_3());
        map.put("p_total_tax_debt", argument.getTotal_tax_debt());
        map.put("p_penya", argument.getPenya());
        map.put("p_penya_3", argument.getPenya_3());
        map.put("p_payed_divident_1", argument.getPayed_divident_1());
        map.put("p_payed_divident_2", argument.getPayed_divident_2());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("create_nalog_org_debt", map);
        return map;
    }

    public Map<String, Object> insertPostup(SqlSession sqlSession, PostupArgument argument) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id_document", argument.getId_document());
        map.put("p_send_date", argument.getSend_date());
        map.put("p_name", argument.getName());
        map.put("p_ns10", argument.getNs10());
        map.put("p_ns11", argument.getNs11());
        map.put("p_tin", argument.getTin());
        map.put("p_sum", argument.getSum());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("create_nalog_postup", map);
        return map;
    }

    public Map<String, Object> insertSectionTax(SqlSession sqlSession, OrgSectionTaxArgument argument) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id_document", argument.getId_document());
        map.put("p_send_date", argument.getSend_date());
        map.put("p_name_obj", argument.getName_obj());
        map.put("p_yur_fiz", argument.getYur_fiz());
        map.put("p_ns10", argument.getNs10());
        map.put("p_ns11", argument.getNs11());
        map.put("p_address", argument.getAddress());
        map.put("p_inno", argument.getInno());
        map.put("p_name", argument.getName());
        map.put("p_tin", argument.getTin());
        map.put("p_pnfl", argument.getPnfl());
        map.put("p_fact_fieldsquare", argument.getFact_fieldsquare());
        map.put("p_fact_kadastr_fieldsquare", argument.getFact_kadastr_fieldsquare());
        map.put("p_fact_buildsquare", argument.getFact_buildsquare());
        map.put("p_fact_freebuildsquare", argument.getFact_freebuildsquare());
        map.put("p_amount", argument.getAmount());
        map.put("p_tasirchan_tax_doc_date", argument.getTasirchan_tax_doc_date());
        map.put("p_tasirchan_tax_doc_num", argument.getTasirchan_tax_doc_num());
        map.put("p_tasirchan_tax_sum", argument.getTasirchan_tax_sum());
        map.put("p_tasirchan_tax_sum_2x", argument.getTasirchan_tax_sum_2x());
        map.put("p_tasirchan_tax_sum_5x", argument.getTasirchan_tax_sum_5x());
        map.put("p_tasirchan_tax_sum_10x", argument.getTasirchan_tax_sum_10x());
        map.put("p_tax_debt", argument.getTax_debt());
        map.put("p_sud_ariza_date", argument.getSud_ariza_date());
        map.put("p_sud_ariza_num", argument.getSud_ariza_num());
        map.put("p_undirish_qaror_date", argument.getUndirish_qaror_date());
        map.put("p_undirish_qaror_num", argument.getUndirish_qaror_num());
        map.put("p_activated_doc_date", argument.getActivated_doc_date());
        map.put("p_activated_doc_num", argument.getActivated_doc_num());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("create_nalog_section_tax", map);
        return map;
    }


}
