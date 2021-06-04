package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CustomResultItem implements Serializable {
    @JsonProperty("G7_A")
    private String g7_a;
    @JsonProperty("G7_B")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date g7_b;
    @JsonProperty("G7_C")
    private String g7_c;
    @JsonProperty("ID_ORG")
    private String id_org;
    @JsonProperty("ERROR")
    private String error;
    @JsonProperty("RECEIVE_TIME_ORG")
    private String receive_time_org;

    public CustomResultItem() {
        this.error = "INIT ERROR";
    }

    public CustomResultItem(DeclarationEntity entity, String errorMsg) {
        this.id_org = null;
        this.error = errorMsg;
        this.g7_a = entity.getG7_a();
        this.g7_b = entity.getG7_b();
        this.g7_c = entity.getG7_c();
    }

    public List<CustomResultItem> singleResult() {
        return Collections.singletonList(this);
    }

    public String getG7_a() {
        return g7_a;
    }

    public void setG7_a(String g7_a) {
        this.g7_a = g7_a;
    }

    public Date getG7_b() {
        return g7_b;
    }

    public void setG7_b(Date g7_b) {
        this.g7_b = g7_b;
    }

    public String getG7_c() {
        return g7_c;
    }

    public void setG7_c(String g7_c) {
        this.g7_c = g7_c;
    }

    public String getId_org() {
        return id_org;
    }

    public void setId_org(String id_org) {
        this.id_org = id_org;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getReceive_time_org() {
        return receive_time_org;
    }

    public void setReceive_time_org(String receive_time_org) {
        this.receive_time_org = receive_time_org;
    }
}
