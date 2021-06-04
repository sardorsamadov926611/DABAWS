package uz.daba.gateway.transports.depozit;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

import java.util.Date;
import java.util.List;

public class DepozitArgument extends BaseEntity {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date date;
    @JsonProperty("ILOVA1")
    private List<DepIteam1Entity> item1;
    @JsonProperty("ILOVA2")
    private List<DepIteam2Entity> item2;
    @JsonProperty("ILOVA3")
    private List<DepIteam3Entity> item3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<DepIteam1Entity> getItem1() {
        return item1;
    }

    public void setItem1(List<DepIteam1Entity> item1) {
        this.item1 = item1;
    }

    public List<DepIteam2Entity> getItem2() {
        return item2;
    }

    public void setItem2(List<DepIteam2Entity> item2) {
        this.item2 = item2;
    }

    public List<DepIteam3Entity> getItem3() {
        return item3;
    }

    public void setItem3(List<DepIteam3Entity> item3) {
        this.item3 = item3;
    }
}
