package uz.daba.gateway.transports.nalog;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class BaseNalogResult implements Serializable {
    @JsonProperty("code")
    private Integer result_code;
    @JsonProperty("text")
    private String result_message;

    public BaseNalogResult() {
        this.result_code = 2;
        this.result_message = "Malumotlarni qabul qilishda xatolik";
    }

    public BaseNalogResult(Integer result_code, String result_message) {
        this.result_code = result_code;
        this.result_message = result_message;
    }

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
