package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class BaseCustomWareHouseEntity {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("Information_Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date information_date;
    @JsonProperty("WareHouseData")
    private List<WareHouseDataEntity> wareHouseDataEntity;

    public BaseCustomWareHouseEntity() {
    }

    public Date getInformation_date() {
        return information_date;
    }

    public void setInformation_date(Date information_date) {
        this.information_date = information_date;
    }

    public List<WareHouseDataEntity> getWareHouseDataEntity() {
        return wareHouseDataEntity;
    }

    public void setWareHouseDataEntity(List<WareHouseDataEntity> wareHouseDataEntity) {
        this.wareHouseDataEntity = wareHouseDataEntity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
