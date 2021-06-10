package uz.daba.gateway.transports.nalog;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgSectionTaxArgument {
    @JsonProperty("id_document")
    private Integer id_document;
    @JsonProperty("send_date")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date send_date;
    @JsonProperty("name_obj")
    private String name_obj;
    @JsonProperty("yur_fiz")
    private Integer yur_fiz;
    @JsonProperty("ns10")
    private Integer ns10;
    @JsonProperty("ns11")
    private Integer ns11;
    @JsonProperty("address")
    private String address;
    @JsonProperty("inno")
    private String inno;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tin")
    private String tin;
    @JsonProperty("pnfl")
    private String pnfl;
    @JsonProperty("fact_fieldsquare")
    private Double fact_fieldsquare;
    @JsonProperty("fact_kadastr_fieldsquare")
    private Double fact_kadastr_fieldsquare;
    @JsonProperty("fact_buildsquare")
    private Double fact_buildsquare;
    @JsonProperty("fact_freebuildsquare")
    private Double fact_freebuildsquare;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("tasirchan_tax_doc_date")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date tasirchan_tax_doc_date;
    @JsonProperty("tasirchan_tax_doc_num")
    private String tasirchan_tax_doc_num;
    @JsonProperty("tasirchan_tax_sum")
    private Double tasirchan_tax_sum;
    @JsonProperty("tasirchan_tax_sum_2x")
    private Double tasirchan_tax_sum_2x;
    @JsonProperty("tasirchan_tax_sum_5x")
    private Double tasirchan_tax_sum_5x;
    @JsonProperty("tasirchan_tax_sum_10x")
    private Double tasirchan_tax_sum_10x;
    @JsonProperty("tax_debt")
    private Double tax_debt;
    @JsonProperty("sud_ariza_date")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date sud_ariza_date;
    @JsonProperty("sud_ariza_num")
    private String sud_ariza_num;
    @JsonProperty("undirish_qaror_date")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date undirish_qaror_date;
    @JsonProperty("undirish_qaror_num")
    private String undirish_qaror_num;
    @JsonProperty("activated_doc_date")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date activated_doc_date;
    @JsonProperty("activated_doc_num")
    private String activated_doc_num;

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

    public String getName_obj() {
        return name_obj;
    }

    public void setName_obj(String name_obj) {
        this.name_obj = name_obj;
    }

    public Integer getYur_fiz() {
        return yur_fiz;
    }

    public void setYur_fiz(Integer yur_fiz) {
        this.yur_fiz = yur_fiz;
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

    public String getInno() {
        return inno;
    }

    public void setInno(String inno) {
        this.inno = inno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getPnfl() {
        return pnfl;
    }

    public void setPnfl(String pnfl) {
        this.pnfl = pnfl;
    }

    public Double getFact_fieldsquare() {
        return fact_fieldsquare;
    }

    public void setFact_fieldsquare(Double fact_fieldsquare) {
        this.fact_fieldsquare = fact_fieldsquare;
    }

    public Double getFact_kadastr_fieldsquare() {
        return fact_kadastr_fieldsquare;
    }

    public void setFact_kadastr_fieldsquare(Double fact_kadastr_fieldsquare) {
        this.fact_kadastr_fieldsquare = fact_kadastr_fieldsquare;
    }

    public Double getFact_buildsquare() {
        return fact_buildsquare;
    }

    public void setFact_buildsquare(Double fact_buildsquare) {
        this.fact_buildsquare = fact_buildsquare;
    }

    public Double getFact_freebuildsquare() {
        return fact_freebuildsquare;
    }

    public void setFact_freebuildsquare(Double fact_freebuildsquare) {
        this.fact_freebuildsquare = fact_freebuildsquare;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getTasirchan_tax_doc_date() {
        return tasirchan_tax_doc_date;
    }

    public void setTasirchan_tax_doc_date(Date tasirchan_tax_doc_date) {
        this.tasirchan_tax_doc_date = tasirchan_tax_doc_date;
    }

    public String getTasirchan_tax_doc_num() {
        return tasirchan_tax_doc_num;
    }

    public void setTasirchan_tax_doc_num(String tasirchan_tax_doc_num) {
        this.tasirchan_tax_doc_num = tasirchan_tax_doc_num;
    }

    public Double getTasirchan_tax_sum() {
        return tasirchan_tax_sum;
    }

    public void setTasirchan_tax_sum(Double tasirchan_tax_sum) {
        this.tasirchan_tax_sum = tasirchan_tax_sum;
    }

    public Double getTasirchan_tax_sum_2x() {
        return tasirchan_tax_sum_2x;
    }

    public void setTasirchan_tax_sum_2x(Double tasirchan_tax_sum_2x) {
        this.tasirchan_tax_sum_2x = tasirchan_tax_sum_2x;
    }

    public Double getTasirchan_tax_sum_5x() {
        return tasirchan_tax_sum_5x;
    }

    public void setTasirchan_tax_sum_5x(Double tasirchan_tax_sum_5x) {
        this.tasirchan_tax_sum_5x = tasirchan_tax_sum_5x;
    }

    public Double getTasirchan_tax_sum_10x() {
        return tasirchan_tax_sum_10x;
    }

    public void setTasirchan_tax_sum_10x(Double tasirchan_tax_sum_10x) {
        this.tasirchan_tax_sum_10x = tasirchan_tax_sum_10x;
    }

    public Double getTax_debt() {
        return tax_debt;
    }

    public void setTax_debt(Double tax_debt) {
        this.tax_debt = tax_debt;
    }

    public Date getSud_ariza_date() {
        return sud_ariza_date;
    }

    public void setSud_ariza_date(Date sud_ariza_date) {
        this.sud_ariza_date = sud_ariza_date;
    }

    public String getSud_ariza_num() {
        return sud_ariza_num;
    }

    public void setSud_ariza_num(String sud_ariza_num) {
        this.sud_ariza_num = sud_ariza_num;
    }

    public Date getUndirish_qaror_date() {
        return undirish_qaror_date;
    }

    public void setUndirish_qaror_date(Date undirish_qaror_date) {
        this.undirish_qaror_date = undirish_qaror_date;
    }

    public String getUndirish_qaror_num() {
        return undirish_qaror_num;
    }

    public void setUndirish_qaror_num(String undirish_qaror_num) {
        this.undirish_qaror_num = undirish_qaror_num;
    }

    public Date getActivated_doc_date() {
        return activated_doc_date;
    }

    public void setActivated_doc_date(Date activated_doc_date) {
        this.activated_doc_date = activated_doc_date;
    }

    public String getActivated_doc_num() {
        return activated_doc_num;
    }

    public void setActivated_doc_num(String activated_doc_num) {
        this.activated_doc_num = activated_doc_num;
    }
}
