package uz.daba.gateway.transports.court;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class BaseCourtResult implements Serializable {
    @JsonProperty("result_code")
    private Integer result_code;
    @JsonProperty("result_message")
    private String result_message;

    public Integer getResult_code() {
        return result_code;
    }

    public void setResult_code(Integer result_code) {
        this.result_code = result_code;
    }

    public String getResult_message() {
        return result_message;
    }

    public void setResult_message(String result_message) {
        this.result_message = result_message;
    }
}
