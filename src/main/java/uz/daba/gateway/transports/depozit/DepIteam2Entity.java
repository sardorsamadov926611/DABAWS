package uz.daba.gateway.transports.depozit;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

public class DepIteam2Entity extends BaseEntity {

    @JsonProperty("N")
    private Integer n;
    @JsonProperty("TIN")
    private String tin;
    @JsonProperty("ISSR_NM_EM")
    private String issr_nm_em;
    @JsonProperty("OPF")
    private String opf;
    @JsonProperty("nOPF")
    private String nopf;
    @JsonProperty("KFS")
    private String kfs;
    @JsonProperty("nKFS")
    private String nkfs;
    @JsonProperty("REGION")
    private String region;
    @JsonProperty("CAPITAL")
    private Double capital;
    @JsonProperty("PVAL")
    private Double pval;
    @JsonProperty("STK_QTY_EM")
    private Double stk_qty_em;
    @JsonProperty("INN")
    private String inn;
    @JsonProperty("CRP_NM")
    private String crp_nm;
    @JsonProperty("OPF_VL")
    private String opf_vl;
    @JsonProperty("nOPF_VL")
    private String nopf_vl;
    @JsonProperty("KFS_VL")
    private String kfs_vl;
    @JsonProperty("nKFS_VL")
    private String nkfs_vl;
    @JsonProperty("PERS_VL")
    private Double pers_vl;
    @JsonProperty("volum_vl")
    private Double volum_vl;
    @JsonProperty("TDY_QTY")
    private Double tdy_qty;


    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getIssr_nm_em() {
        return issr_nm_em;
    }

    public void setIssr_nm_em(String issr_nm_em) {
        this.issr_nm_em = issr_nm_em;
    }

    public String getOpf() {
        return opf;
    }

    public void setOpf(String opf) {
        this.opf = opf;
    }

    public String getNopf() {
        return nopf;
    }

    public void setNopf(String nopf) {
        this.nopf = nopf;
    }

    public String getKfs() {
        return kfs;
    }

    public void setKfs(String kfs) {
        this.kfs = kfs;
    }

    public String getNkfs() {
        return nkfs;
    }

    public void setNkfs(String nkfs) {
        this.nkfs = nkfs;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getPval() {
        return pval;
    }

    public void setPval(Double pval) {
        this.pval = pval;
    }

    public Double getStk_qty_em() {
        return stk_qty_em;
    }

    public void setStk_qty_em(Double stk_qty_em) {
        this.stk_qty_em = stk_qty_em;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getCrp_nm() {
        return crp_nm;
    }

    public void setCrp_nm(String crp_nm) {
        this.crp_nm = crp_nm;
    }

    public String getOpf_vl() {
        return opf_vl;
    }

    public void setOpf_vl(String opf_vl) {
        this.opf_vl = opf_vl;
    }

    public String getNopf_vl() {
        return nopf_vl;
    }

    public void setNopf_vl(String nopf_vl) {
        this.nopf_vl = nopf_vl;
    }

    public String getKfs_vl() {
        return kfs_vl;
    }

    public void setKfs_vl(String kfs_vl) {
        this.kfs_vl = kfs_vl;
    }

    public String getNkfs_vl() {
        return nkfs_vl;
    }

    public void setNkfs_vl(String nkfs_vl) {
        this.nkfs_vl = nkfs_vl;
    }

    public Double getPers_vl() {
        return pers_vl;
    }

    public void setPers_vl(Double pers_vl) {
        this.pers_vl = pers_vl;
    }

    public Double getVolum_vl() {
        return volum_vl;
    }

    public void setVolum_vl(Double volum_vl) {
        this.volum_vl = volum_vl;
    }

    public Double getTdy_qty() {
        return tdy_qty;
    }

    public void setTdy_qty(Double tdy_qty) {
        this.tdy_qty = tdy_qty;
    }
}
