package uz.daba.gateway.transports.nalog;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostupArgument {
    @JsonProperty("id_document")
    private Integer id_document;
    @JsonProperty("send_date")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date send_date;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ns10")
    private Integer ns10;
    @JsonProperty("ns11")
    private Integer ns11;
    @JsonProperty("tin")
    private String tin;
    @JsonProperty("sum")
    private Double sum;


    public Integer getId_document() {
        return id_document;
    }

    public void setId_document(Integer id_document) {
        this.id_document = id_document;
    }

    public Date getSend_date() {
        return send_date;
    }

    public void setSend_date(Date send_date) {
        this.send_date = send_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNs10() {
        return ns10;
    }

    public void setNs10(Integer ns10) {
        this.ns10 = ns10;
    }

    public Integer getNs11() {
        return ns11;
    }

    public void setNs11(Integer ns11) {
        this.ns11 = ns11;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
