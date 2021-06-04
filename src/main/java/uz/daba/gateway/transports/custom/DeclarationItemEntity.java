package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeclarationItemEntity {
    @JsonProperty("G32")
    private String g32;
    @JsonProperty("G31_NAME")
    private String g31_name;
    @JsonProperty("G33")
    private String g33;
    @JsonProperty("G38")
    private Double g38;
    @JsonProperty("G31_AMOUNT")
    private Double g31_amount;
    @JsonProperty("G41")
    private String g41;
    @JsonProperty("G46")
    private Double g46;

    public DeclarationItemEntity() {
    }

    public String getG32() {
        return g32;
    }

    public void setG32(String g32) {
        this.g32 = g32;
    }

    public String getG31_name() {
        return g31_name;
    }

    public void setG31_name(String g31_name) {
        this.g31_name = g31_name;
    }

    public String getG33() {
        return g33;
    }

    public void setG33(String g33) {
        this.g33 = g33;
    }

    public Double getG38() {
        return g38;
    }

    public void setG38(Double g38) {
        this.g38 = g38;
    }

    public Double getG31_amount() {
        return g31_amount;
    }

    public void setG31_amount(Double g31_amount) {
        this.g31_amount = g31_amount;
    }

    public String getG41() {
        return g41;
    }

    public void setG41(String g41) {
        this.g41 = g41;
    }

    public Double getG46() {
        return g46;
    }

    public void setG46(Double g46) {
        this.g46 = g46;
    }
}
