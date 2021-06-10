package uz.daba.gateway.transports.nalog;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgDebtArgument {
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
    @JsonProperty("address")
    private String address;
    @JsonProperty("yirik_taxpayer")
    private String yirik_taxpayer;
    @JsonProperty("tin")
    private String tin;
    @JsonProperty("activity_code")
    private Integer activity_code;
    @JsonProperty("payed_taxes")
    private Double payed_taxes;
    @JsonProperty("nds")
    private Double nds;
    @JsonProperty("aksiz")
    private Double aksiz;
    @JsonProperty("dividend")
    private Double dividend;
    @JsonProperty("others")
    private Double others;
    @JsonProperty("main_debt")
    private Double main_debt;
    @JsonProperty("main_debt_3")
    private Double main_debt_3;
    @JsonProperty("total_tax_debt")
    private Double total_tax_debt;
    @JsonProperty("penya")
    private Double penya;
    @JsonProperty("penya_3")
    private Double penya_3;
    @JsonProperty("payed_divident_1")
    private Double payed_divident_1;
    @JsonProperty("payed_divident_2")
    private Double payed_divident_2;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYirik_taxpayer() {
        return yirik_taxpayer;
    }

    public void setYirik_taxpayer(String yirik_taxpayer) {
        this.yirik_taxpayer = yirik_taxpayer;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public Integer getActivity_code() {
        return activity_code;
    }

    public void setActivity_code(Integer activity_code) {
        this.activity_code = activity_code;
    }

    public Double getPayed_taxes() {
        return payed_taxes;
    }

    public void setPayed_taxes(Double payed_taxes) {
        this.payed_taxes = payed_taxes;
    }

    public Double getNds() {
        return nds;
    }

    public void setNds(Double nds) {
        this.nds = nds;
    }

    public Double getAksiz() {
        return aksiz;
    }

    public void setAksiz(Double aksiz) {
        this.aksiz = aksiz;
    }

    public Double getDividend() {
        return dividend;
    }

    public void setDividend(Double dividend) {
        this.dividend = dividend;
    }

    public Double getOthers() {
        return others;
    }

    public void setOthers(Double others) {
        this.others = others;
    }

    public Double getMain_debt() {
        return main_debt;
    }

    public void setMain_debt(Double main_debt) {
        this.main_debt = main_debt;
    }

    public Double getMain_debt_3() {
        return main_debt_3;
    }

    public void setMain_debt_3(Double main_debt_3) {
        this.main_debt_3 = main_debt_3;
    }

    public Double getTotal_tax_debt() {
        return total_tax_debt;
    }

    public void setTotal_tax_debt(Double total_tax_debt) {
        this.total_tax_debt = total_tax_debt;
    }

    public Double getPenya() {
        return penya;
    }

    public void setPenya(Double penya) {
        this.penya = penya;
    }

    public Double getPenya_3() {
        return penya_3;
    }

    public void setPenya_3(Double penya_3) {
        this.penya_3 = penya_3;
    }

    public Double getPayed_divident_1() {
        return payed_divident_1;
    }

    public void setPayed_divident_1(Double payed_divident_1) {
        this.payed_divident_1 = payed_divident_1;
    }

    public Double getPayed_divident_2() {
        return payed_divident_2;
    }

    public void setPayed_divident_2(Double payed_divident_2) {
        this.payed_divident_2 = payed_divident_2;
    }
}
