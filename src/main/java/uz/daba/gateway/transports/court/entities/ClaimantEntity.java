package uz.daba.gateway.transports.court.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

public class ClaimantEntity extends BaseEntity {

    @JsonProperty("claimantOrgName")
    private String claimantOrgName;
    @JsonProperty("claimantAddress")
    private String claimantAddress;
    @JsonProperty("claimantRegionId")
    private String claimantRegionId;
    @JsonProperty("claimantDistrictId")
    private String claimantDistrictId;
    @JsonProperty("claimantBank")
    private String claimantBank;
    @JsonProperty("claimantTin")
    private String claimantTin;
    @JsonProperty("claimantMfo")
    private String claimantMfo;

    public String getClaimantOrgName() {
        return claimantOrgName;
    }

    public void setClaimantOrgName(String claimantOrgName) {
        this.claimantOrgName = claimantOrgName;
    }

    public String getClaimantAddress() {
        return claimantAddress;
    }

    public void setClaimantAddress(String claimantAddress) {
        this.claimantAddress = claimantAddress;
    }

    public String getClaimantBank() {
        return claimantBank;
    }

    public void setClaimantBank(String claimantBank) {
        this.claimantBank = claimantBank;
    }

    public String getClaimantTin() {
        return claimantTin;
    }

    public void setClaimantTin(String claimantTin) {
        this.claimantTin = claimantTin;
    }

    public String getClaimantMfo() {
        return claimantMfo;
    }

    public void setClaimantMfo(String claimantMfo) {
        this.claimantMfo = claimantMfo;
    }

    public String getClaimantRegionId() {
        return claimantRegionId;
    }

    public void setClaimantRegionId(String claimantRegionId) {
        this.claimantRegionId = claimantRegionId;
    }

    public String getClaimantDistrictId() {
        return claimantDistrictId;
    }

    public void setClaimantDistrictId(String claimantDistrictId) {
        this.claimantDistrictId = claimantDistrictId;
    }
}
