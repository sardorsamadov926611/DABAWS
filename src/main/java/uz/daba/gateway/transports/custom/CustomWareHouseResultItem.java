package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.utils.Utils;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CustomWareHouseResultItem implements Serializable {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("flag")
    private Integer flag;
    @JsonProperty("ID_ORG")
    private String id_org;
    @JsonProperty("ERROR")
    private String error;

    public CustomWareHouseResultItem() {
        this.error = "INIT ERROR";
    }

    public CustomWareHouseResultItem(String id,  String id_org, String error) {
        this.id = id;
        this.flag = Utils.parseInt(id_org);
        this.id_org = id_org;
        this.error = error;
    }

    public List<CustomWareHouseResultItem> singleResult() {
        return Collections.singletonList(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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
}
