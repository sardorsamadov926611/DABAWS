package uz.daba.gateway.transports.court.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

public class RepresentorEntity extends BaseEntity {

    @JsonProperty("representorOrgName")
    private String representorOrgName;
    @JsonProperty("representorAddress")
    private String representorAddress;
    @JsonProperty("representorRegionId")
    private String representorRegionId;
    @JsonProperty("representorDistrictId")
    private String representorDistrictId;
    @JsonProperty("representorBank")
    private String representorBank;
    @JsonProperty("representorTin")
    private String representorTin;
    @JsonProperty("representorMfo")
    private String representorMfo;

    public String getRepresentorOrgName() {
        return representorOrgName;
    }

    public void setRepresentorOrgName(String representorOrgName) {
        this.representorOrgName = representorOrgName;
    }

    public String getRepresentorAddress() {
        return representorAddress;
    }

    public void setRepresentorAddress(String representorAddress) {
        this.representorAddress = representorAddress;
    }

    public String getRepresentorBank() {
        return representorBank;
    }

    public void setRepresentorBank(String representorBank) {
        this.representorBank = representorBank;
    }

    public String getRepresentorTin() {
        return representorTin;
    }

    public void setRepresentorTin(String representorTin) {
        this.representorTin = representorTin;
    }

    public String getRepresentorMfo() {
        return representorMfo;
    }

    public void setRepresentorMfo(String representorMfo) {
        this.representorMfo = representorMfo;
    }

    public String getRepresentorRegionId() {
        return representorRegionId;
    }

    public void setRepresentorRegionId(String representorRegionId) {
        this.representorRegionId = representorRegionId;
    }

    public String getRepresentorDistrictId() {
        return representorDistrictId;
    }

    public void setRepresentorDistrictId(String representorDistrictId) {
        this.representorDistrictId = representorDistrictId;
    }
}
