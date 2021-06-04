package uz.daba.gateway.transports.court;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.court.entities.*;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BankruptArgument extends BaseCourtArgument {

    @JsonProperty("claimId")
    private Integer claimId;
    @JsonProperty("caseNumber")
    private String caseNumber;
    @JsonProperty("judge")
    private String judge;
    @JsonProperty("hearingDate")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date hearingDate;
    @JsonProperty("result")
    private Integer result;
    @JsonProperty("decisionFile")
    private String decisionFile;
    @JsonProperty("claimant")
    private ClaimantEntity claimant;
    @JsonProperty("defendant")
    private DefendantEntity defendant;
    @JsonProperty("representingOrg")
    private RepresentorEntity representingOrg;
    @JsonProperty("court")
    private Integer court;
    @JsonProperty("definitionDate")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date definitionDate;
    @JsonProperty("claimCategory")
    private Integer claimCategory;
    @JsonProperty("bankruptcyInCommon")
    private Integer bankruptcyInCommon;
    @JsonProperty("bankruptcyDeptAmount")
    private Long bankruptcyDeptAmount;
    @JsonProperty("bankruptcyDeptOnBudget")
    private Long bankruptcyDeptOnBudget;
    @JsonProperty("bankruptcyReportReturnedDate")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date bankruptcyReportReturnedDate;
    @JsonProperty("bankruptcyTrustee")
    private List<BankruptcyTrusteeEntity> bankruptcyTrustee;
    @JsonProperty("payable")
    private List<PayableEntity> payable;
    @JsonProperty("nonMaterialRequirement")
    private List<NonMaterialRequirementEntity> nonMaterialRequirement;

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public Date getHearingDate() {
        return hearingDate;
    }

    public void setHearingDate(Date hearingDate) {
        this.hearingDate = hearingDate;
    }

    public String getDecisionFile() {
        return decisionFile;
    }

    public void setDecisionFile(String decisionFile) {
        this.decisionFile = decisionFile;
    }

    public ClaimantEntity getClaimant() {
        return claimant;
    }

    public void setClaimant(ClaimantEntity claimant) {
        this.claimant = claimant;
    }

    public DefendantEntity getDefendant() {
        return defendant;
    }

    public void setDefendant(DefendantEntity defendant) {
        this.defendant = defendant;
    }

    public RepresentorEntity getRepresentingOrg() {
        return representingOrg;
    }

    public void setRepresentingOrg(RepresentorEntity representingOrg) {
        this.representingOrg = representingOrg;
    }

    public Integer getCourt() {
        return court;
    }

    public void setCourt(Integer court) {
        this.court = court;
    }

    public Date getDefinitionDate() {
        return definitionDate;
    }

    public void setDefinitionDate(Date definitionDate) {
        this.definitionDate = definitionDate;
    }

    public Integer getBankruptcyInCommon() {
        return bankruptcyInCommon;
    }

    public void setBankruptcyInCommon(Integer bankruptcyInCommon) {
        this.bankruptcyInCommon = bankruptcyInCommon;
    }

    public Long getBankruptcyDeptAmount() {
        return bankruptcyDeptAmount;
    }

    public void setBankruptcyDeptAmount(Long bankruptcyDeptAmount) {
        this.bankruptcyDeptAmount = bankruptcyDeptAmount;
    }

    public Long getBankruptcyDeptOnBudget() {
        return bankruptcyDeptOnBudget;
    }

    public void setBankruptcyDeptOnBudget(Long bankruptcyDeptOnBudget) {
        this.bankruptcyDeptOnBudget = bankruptcyDeptOnBudget;
    }

    public Date getBankruptcyReportReturnedDate() {
        return bankruptcyReportReturnedDate;
    }

    public void setBankruptcyReportReturnedDate(Date bankruptcyReportReturnedDate) {
        this.bankruptcyReportReturnedDate = bankruptcyReportReturnedDate;
    }

    public List<BankruptcyTrusteeEntity> getBankruptcyTrustee() {
        return bankruptcyTrustee;
    }

    public void setBankruptcyTrustee(List<BankruptcyTrusteeEntity> bankruptcyTrustee) {
        this.bankruptcyTrustee = bankruptcyTrustee;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getClaimCategory() {
        return claimCategory;
    }

    public void setClaimCategory(Integer claimCategory) {
        this.claimCategory = claimCategory;
    }

    public List<PayableEntity> getPayable() {
        return payable;
    }

    public void setPayable(List<PayableEntity> payable) {
        this.payable = payable;
    }

    public List<NonMaterialRequirementEntity> getNonMaterialRequirement() {
        return nonMaterialRequirement;
    }

    public void setNonMaterialRequirement(List<NonMaterialRequirementEntity> nonMaterialRequirement) {
        this.nonMaterialRequirement = nonMaterialRequirement;
    }
}
