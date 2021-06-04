package uz.daba.gateway.transports.court.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

public class DefendantEntity extends BaseEntity {

    @JsonProperty("defendantOrgName")
    private String defendantOrgName;
    @JsonProperty("defendantAddress")
    private String defendantAddress;
    @JsonProperty("defendantRegionId")
    private String defendantRegionId;
    @JsonProperty("defendantDistrictId")
    private String defendantDistrictId;
    @JsonProperty("defendantBank")
    private String defendantBank;
    @JsonProperty("defendantTin")
    private String defendantTin;
    @JsonProperty("defendantMfo")
    private String defendantMfo;

    public String getDefendantOrgName() {
        return defendantOrgName;
    }

    public void setDefendantOrgName(String defendantOrgName) {
        this.defendantOrgName = defendantOrgName;
    }

    public String getDefendantAddress() {
        return defendantAddress;
    }

    public void setDefendantAddress(String defendantAddress) {
        this.defendantAddress = defendantAddress;
    }

    public String getDefendantBank() {
        return defendantBank;
    }

    public void setDefendantBank(String defendantBank) {
        this.defendantBank = defendantBank;
    }

    public String getDefendantTin() {
        return defendantTin;
    }

    public void setDefendantTin(String defendantTin) {
        this.defendantTin = defendantTin;
    }

    public String getDefendantMfo() {
        return defendantMfo;
    }

    public void setDefendantMfo(String defendantMfo) {
        this.defendantMfo = defendantMfo;
    }

    public String getDefendantRegionId() {
        return defendantRegionId;
    }

    public void setDefendantRegionId(String defendantRegionId) {
        this.defendantRegionId = defendantRegionId;
    }

    public String getDefendantDistrictId() {
        return defendantDistrictId;
    }

    public void setDefendantDistrictId(String defendantDistrictId) {
        this.defendantDistrictId = defendantDistrictId;
    }
}
