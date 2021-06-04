package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

public class BaseCustomArgument extends BaseEntity {
    @JsonProperty("GTDInformation")
    private BaseCustomInfoEntity GTDInformation;

    public BaseCustomInfoEntity getGTDInformation() {
        return GTDInformation;
    }

    public void setGTDInformation(BaseCustomInfoEntity GTDInformation) {
        this.GTDInformation = GTDInformation;
    }
}
