package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CustomWareResult implements Serializable {
    @JsonProperty("result")
    private CustomWareHouseResultItem result;


    public CustomWareHouseResultItem getResult() {
        return result;
    }

    public void setResult(CustomWareHouseResultItem result) {
        this.result = result;
    }
}
