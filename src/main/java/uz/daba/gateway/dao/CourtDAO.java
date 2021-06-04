package uz.daba.gateway.dao;

import org.apache.ibatis.session.SqlSession;
import uz.daba.gateway.transports.court.BankruptArgument;
import uz.daba.gateway.transports.court.entities.*;

import java.util.HashMap;
import java.util.Map;

public class CourtDAO {

    public Map<String, Object> insertBankrupData(SqlSession sqlSession, BankruptArgument argument, Integer fileId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_claim_id", argument.getClaimId());
        map.put("p_case_number", argument.getCaseNumber());
        map.put("p_judge", argument.getJudge());
        map.put("p_hearin_date", argument.getHearingDate());
        map.put("p_court_result", argument.getResult());
        map.put("p_court_id", argument.getCourt());
        map.put("p_definition_date", argument.getDefinitionDate());
        map.put("p_claim_category", argument.getClaimCategory());
        map.put("p_in_common", argument.getBankruptcyInCommon());
        map.put("p_dept_amount", argument.getBankruptcyDeptAmount());
        map.put("p_dept_on_budget", argument.getBankruptcyDeptOnBudget());
        map.put("p_return_date", argument.getBankruptcyReportReturnedDate());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_bankrup_court_data", map);
        return map;
    }

    public Map<String, Object> insertBankrupClaimant(SqlSession sqlSession, Integer newId, ClaimantEntity entity, Integer claimId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_claim_id", claimId);
        map.put("p_org_name", entity.getClaimantOrgName());
        map.put("p_address", entity.getClaimantAddress());
        map.put("p_region_id", entity.getClaimantRegionId());
        map.put("p_district_id", entity.getClaimantDistrictId());
        map.put("p_bank_name", entity.getClaimantBank());
        map.put("p_inn", entity.getClaimantTin());
        map.put("p_mfo", entity.getClaimantMfo());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_bankrup_claimant", map);
        return map;
    }

    public Map<String, Object> insertBankrupDefendant(SqlSession sqlSession, Integer newId, DefendantEntity entity, Integer claimId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_claim_id", claimId);
        map.put("p_org_name", entity.getDefendantOrgName());
        map.put("p_address", entity.getDefendantAddress());
        map.put("p_region_id", entity.getDefendantRegionId());
        map.put("p_district_id", entity.getDefendantDistrictId());
        map.put("p_bank_name", entity.getDefendantBank());
        map.put("p_inn", entity.getDefendantTin());
        map.put("p_mfo", entity.getDefendantMfo());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_bankrup_defendant", map);
        return map;
    }

    public Map<String, Object> insertBankrupRepresentor(SqlSession sqlSession, Integer newId, RepresentorEntity entity, Integer claimId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_claim_id", claimId);
        map.put("p_org_name", entity.getRepresentorOrgName());
        map.put("p_address", entity.getRepresentorAddress());
        map.put("p_region_id", entity.getRepresentorRegionId());
        map.put("p_district_id", entity.getRepresentorDistrictId());
        map.put("p_bank_name", entity.getRepresentorBank());
        map.put("p_inn", entity.getRepresentorTin());
        map.put("p_mfo", entity.getRepresentorMfo());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_bankrup_representor", map);
        return map;
    }

    public Map<String, Object> insertBankrupTrustee(SqlSession sqlSession, Integer newId, BankruptcyTrusteeEntity entity, Integer claimId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_claim_id", claimId);
        map.put("p_appoint_date", entity.getBankruptcyTrusteeAppointDate());
        map.put("p_name", entity.getBankruptcyTrusteeName());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_bankrup_trustee", map);
        return map;
    }


    public Map<String, Object> insertCourtFile(SqlSession sqlSession, Integer newId, Long fileSize) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_obj_id", newId);
        map.put("p_name", newId);
        map.put("p_ext", "pdf");
        map.put("p_size", fileSize);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_court_file", map);
        return map;
    }

    public Map<String, Object> insertPayable(SqlSession sqlSession, Integer newId, PayableEntity entity, Integer claimId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_claim_id", claimId);
        map.put("p_payable_type", entity.getPayableType());
        map.put("p_payable_total", entity.getPayableTotal());
        map.put("p_payable_currency", entity.getPayableCurrency());
        map.put("p_payable_participant", entity.getPayableParticipant());
        map.put("p_payable_in_fovar_participant", entity.getPayableInFavorOfParticipant());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_payable", map);
        return map;
    }

    public Map<String, Object> insertNonMaterialRequirement(SqlSession sqlSession, Integer newId, NonMaterialRequirementEntity entity, Integer claimId) {
        Map<String, Object> map = new HashMap<>();

        map.put("p_id", newId);
        map.put("p_claim_id", claimId);
        map.put("p_requirement_type", entity.getNonMaterialRequirementType());
        map.put("p_requirement_participant", entity.getNonMaterialRequirementParticipant());
        map.put("p_new_id", null);
        map.put("p_result", null);
        map.put("p_res_msg", null);

        sqlSession.update("insert_material_requirement", map);
        return map;
    }
}
