package uz.daba.gateway.transports.court.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

import java.util.Date;

public class BankruptcyTrusteeEntity extends BaseEntity {


    @JsonProperty("bankruptcyTrusteeAppointDate")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date bankruptcyTrusteeAppointDate;
    @JsonProperty("bankruptcyTrusteeName")
    private String bankruptcyTrusteeName;


    public Date getBankruptcyTrusteeAppointDate() {
        return bankruptcyTrusteeAppointDate;
    }

    public void setBankruptcyTrusteeAppointDate(Date bankruptcyTrusteeAppointDate) {
        this.bankruptcyTrusteeAppointDate = bankruptcyTrusteeAppointDate;
    }

    public String getBankruptcyTrusteeName() {
        return bankruptcyTrusteeName;
    }

    public void setBankruptcyTrusteeName(String bankruptcyTrusteeName) {
        this.bankruptcyTrusteeName = bankruptcyTrusteeName;
    }
}
