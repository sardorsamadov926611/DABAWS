package uz.daba.gateway.transports.court.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

public class PayableEntity extends BaseEntity {
    @JsonProperty("payableType")
    private Integer payableType;
    @JsonProperty("payableTotal")
    private Long payableTotal;
    @JsonProperty("payableCurrency")
    private Integer payableCurrency;
    @JsonProperty("payableParticipant")
    private String payableParticipant;
    @JsonProperty("payableInFavorOfParticipant")
    private String payableInFavorOfParticipant;

    public Integer getPayableType() {
        return payableType;
    }

    public void setPayableType(Integer payableType) {
        this.payableType = payableType;
    }

    public Long getPayableTotal() {
        return payableTotal;
    }

    public void setPayableTotal(Long payableTotal) {
        this.payableTotal = payableTotal;
    }

    public Integer getPayableCurrency() {
        return payableCurrency;
    }

    public void setPayableCurrency(Integer payableCurrency) {
        this.payableCurrency = payableCurrency;
    }

    public String getPayableParticipant() {
        return payableParticipant;
    }

    public void setPayableParticipant(String payableParticipant) {
        this.payableParticipant = payableParticipant;
    }

    public String getPayableInFavorOfParticipant() {
        return payableInFavorOfParticipant;
    }

    public void setPayableInFavorOfParticipant(String payableInFavorOfParticipant) {
        this.payableInFavorOfParticipant = payableInFavorOfParticipant;
    }
}
