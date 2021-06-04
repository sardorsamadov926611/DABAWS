package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class BaseCustomInfoEntity {

    @JsonProperty("Information_Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date information_date;
    @JsonProperty("DeclarationData")
    private DeclarationEntity declarationdata;

    public BaseCustomInfoEntity() {
    }

    public Date getInformation_date() {
        return information_date;
    }

    public void setInformation_date(Date information_date) {
        this.information_date = information_date;
    }

    public DeclarationEntity getDeclarationdata() {
        return declarationdata;
    }

    public void setDeclarationdata(DeclarationEntity declarationdata) {
        this.declarationdata = declarationdata;
    }
}
