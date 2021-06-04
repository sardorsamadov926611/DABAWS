package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class WareHouseDataEntity {
    @JsonProperty("licen")
    private String licen_number;
    @JsonProperty("name")
    private String name;
    @JsonProperty("G8_NAME")
    private String receiver_name;
    @JsonProperty("G8_CODE2")
    private String inn;
    @JsonProperty("G1_A")
    private String type_gtk;
    @JsonProperty("G1_B")
    private String number_custom;
    @JsonProperty("G7_A")
    private String post_number;
    @JsonProperty("G7_B")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date_gtk;
    @JsonProperty("G7_C")
    private String number_gtk;
    @JsonProperty("G33")
    private String tnv_code;
    @JsonProperty("G31_NAME")
    private String tovar_name;
    @JsonProperty("G46")
    private Double static_cost;
    @JsonProperty("S38")
    private Double balance_weight;
    @JsonProperty("flag")
    private Integer flag;

    public String getLicen_number() {
        return licen_number;
    }

    public void setLicen_number(String licen_number) {
        this.licen_number = licen_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getType_gtk() {
        return type_gtk;
    }

    public void setType_gtk(String type_gtk) {
        this.type_gtk = type_gtk;
    }

    public String getNumber_custom() {
        return number_custom;
    }

    public void setNumber_custom(String number_custom) {
        this.number_custom = number_custom;
    }

    public String getPost_number() {
        return post_number;
    }

    public void setPost_number(String post_number) {
        this.post_number = post_number;
    }

    public Date getDate_gtk() {
        return date_gtk;
    }

    public void setDate_gtk(Date date_gtk) {
        this.date_gtk = date_gtk;
    }

    public String getNumber_gtk() {
        return number_gtk;
    }

    public void setNumber_gtk(String number_gtk) {
        this.number_gtk = number_gtk;
    }

    public String getTnv_code() {
        return tnv_code;
    }

    public void setTnv_code(String tnv_code) {
        this.tnv_code = tnv_code;
    }

    public String getTovar_name() {
        return tovar_name;
    }

    public void setTovar_name(String tovar_name) {
        this.tovar_name = tovar_name;
    }

    public Double getStatic_cost() {
        return static_cost;
    }

    public void setStatic_cost(Double static_cost) {
        this.static_cost = static_cost;
    }

    public Double getBalance_weight() {
        return balance_weight;
    }

    public void setBalance_weight(Double balance_weight) {
        this.balance_weight = balance_weight;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
