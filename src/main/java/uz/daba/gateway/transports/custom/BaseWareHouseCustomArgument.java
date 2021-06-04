package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

public class BaseWareHouseCustomArgument extends BaseEntity {
    @JsonProperty("WH_Information")
    private BaseCustomWareHouseEntity information;

    public BaseCustomWareHouseEntity getInformation() {
        return information;
    }

    public void setInformation(BaseCustomWareHouseEntity information) {
        this.information = information;
    }
}
