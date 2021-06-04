package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class CustomResult implements Serializable {
    @JsonProperty("result")
    private CustomResultItem result;


    public CustomResultItem getResult() {
        return result;
    }

    public void setResult(CustomResultItem result) {
        this.result = result;
    }
}
