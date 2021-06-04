package uz.daba.gateway.transports.depozit;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

import java.util.Date;

public class DepIteam3Entity extends BaseEntity {

    @JsonProperty("NN")
    private Integer nn;
    @JsonProperty("INN")
    private String inn;
    @JsonProperty("CRP_NM")
    private String crp_nm;
    @JsonProperty("OPF")
    private String opf;
    @JsonProperty("nOPF")
    private String nopf;
    @JsonProperty("KFS")
    private String kfs;
    @JsonProperty("nKFS")
    private String nkfs;
    @JsonProperty("pers")
    private Double pers;
    @JsonProperty("VOLUME")
    private Double volume;
    @JsonProperty("TDY_QTY")
    private Double tdy_qty;
    @JsonProperty("TIN")
    private String tin;
    @JsonProperty("ISSR_NM")
    private String issr_nm;
    @JsonProperty("OPF_PR")
    private String opf_pr;
    @JsonProperty("nOPF_PR")
    private String nopf_pr;
    @JsonProperty("KFS_PR")
    private String kfs_pr;
    @JsonProperty("nKFS_PR")
    private String nkfs_pr;
    @JsonProperty("nREGN_PR")
    private String nregn_pr;
    @JsonProperty("VOLUME_PR")
    private Double volume_pr;
    @JsonProperty("PVAL")
    private Double pval;
    @JsonProperty("CURRENT_STKQTY")
    private Double current_stkqty;


    @JsonProperty("N")
    private Integer n;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nkfs")
    private String nkfs_;
    @JsonProperty("nreestr")
    private String nreestr;
    @JsonFormat(pattern = "dd.MM.yyyy")
    @JsonProperty("date")
    private Date date;
    @JsonProperty("INN_OOO")
    private String inn_ooo;
    @JsonProperty("okpo")
    private String okpo;
    @JsonProperty("OOO_soogu")
    private String OOO_soogu;
    @JsonProperty("oked")
    private String oked;
    @JsonProperty("OOO_mfo")
    private String OOO_mfo;
    @JsonProperty("telno")
    private String telno;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("email")
    private String email;
    @JsonProperty("ncsdp")
    private String ncsdp;
    @JsonProperty("OOO_region")
    private String OOO_region;
    @JsonProperty("adres")
    private String adres;
    @JsonProperty("street")
    private String street;
    @JsonProperty("uchred")
    private String uchred;
    @JsonProperty("gos_pers")
    private Double gos_pers;
    @JsonProperty("xzu_pers")
    private Double xzu_pers;
    @JsonProperty("nsoogu")
    private String nsoogu;

    public Integer getNn() {
        return nn;
    }

    public void setNn(Integer nn) {
        this.nn = nn;
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

    public String getNreestr() {
        return nreestr;
    }

    public void setNreestr(String nreestr) {
        this.nreestr = nreestr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInn_ooo() {
        return inn_ooo;
    }

    public void setInn_ooo(String inn_ooo) {
        this.inn_ooo = inn_ooo;
    }

    public String getOkpo() {
        return okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    public String getOOO_soogu() {
        return OOO_soogu;
    }

    public void setOOO_soogu(String OOO_soogu) {
        this.OOO_soogu = OOO_soogu;
    }

    public String getOked() {
        return oked;
    }

    public void setOked(String oked) {
        this.oked = oked;
    }

    public String getOOO_mfo() {
        return OOO_mfo;
    }

    public void setOOO_mfo(String OOO_mfo) {
        this.OOO_mfo = OOO_mfo;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNcsdp() {
        return ncsdp;
    }

    public void setNcsdp(String ncsdp) {
        this.ncsdp = ncsdp;
    }

    public String getOOO_region() {
        return OOO_region;
    }

    public void setOOO_region(String OOO_region) {
        this.OOO_region = OOO_region;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUchred() {
        return uchred;
    }

    public void setUchred(String uchred) {
        this.uchred = uchred;
    }

    public Double getGos_pers() {
        return gos_pers;
    }
    public void setGos_pers(Double gos_pers) {
        this.gos_pers = gos_pers;
    }
    public Double getXzu_pers() {
        return xzu_pers;
    }
    public void setXzu_pers(Double xzu_pers) {
        this.xzu_pers = xzu_pers;
    }
    public String getNsoogu() {
        return nsoogu;
    }

    public void setNsoogu(String nsoogu) {
        this.nsoogu = nsoogu;
    }

    public Double getPers() {
        return pers;
    }

    public void setPers(Double pers) {
        this.pers = pers;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getTdy_qty() {
        return tdy_qty;
    }

    public void setTdy_qty(Double tdy_qty) {
        this.tdy_qty = tdy_qty;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getIssr_nm() {
        return issr_nm;
    }

    public void setIssr_nm(String issr_nm) {
        this.issr_nm = issr_nm;
    }

    public String getOpf_pr() {
        return opf_pr;
    }

    public void setOpf_pr(String opf_pr) {
        this.opf_pr = opf_pr;
    }

    public String getNopf_pr() {
        return nopf_pr;
    }

    public void setNopf_pr(String nopf_pr) {
        this.nopf_pr = nopf_pr;
    }

    public String getKfs_pr() {
        return kfs_pr;
    }

    public void setKfs_pr(String kfs_pr) {
        this.kfs_pr = kfs_pr;
    }

    public String getNkfs_pr() {
        return nkfs_pr;
    }

    public void setNkfs_pr(String nkfs_pr) {
        this.nkfs_pr = nkfs_pr;
    }

    public String getNregn_pr() {
        return nregn_pr;
    }

    public void setNregn_pr(String nregn_pr) {
        this.nregn_pr = nregn_pr;
    }

    public Double getVolume_pr() {
        return volume_pr;
    }

    public void setVolume_pr(Double volume_pr) {
        this.volume_pr = volume_pr;
    }

    public Double getPval() {
        return pval;
    }

    public void setPval(Double pval) {
        this.pval = pval;
    }

    public Double getCurrent_stkqty() {
        return current_stkqty;
    }

    public void setCurrent_stkqty(Double current_stkqty) {
        this.current_stkqty = current_stkqty;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNkfs_() {
        return nkfs_;
    }

    public void setNkfs_(String nkfs_) {
        this.nkfs_ = nkfs_;
    }
}
