package uz.daba.gateway.transports.court;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ReceiverInfoResult extends BaseCourtResult {

    @JsonProperty("passport_number")
    private String passport_number;
    @JsonProperty("pnfl")
    private String pnfl;
    @JsonProperty("fio")
    private String fio;
    @JsonProperty("birth_date")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date birth_date;
    @JsonProperty("inn")
    private String inn;
    @JsonProperty("region_id")
    private Integer region_id;
    @JsonProperty("area_id")
    private Integer area_id;
    @JsonProperty("address")
    private String address;
    @JsonProperty("passport_given_date")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date passport_given_date;
    @JsonProperty("passport_given_from")
    private String passport_given_from;
    @JsonProperty("phone_number")
    private String phone_number;
    @JsonProperty("experience_work")
    private String experience_work;
    @JsonProperty("specialty")
    private String specialty;
    @JsonProperty("additional_info")
    private String additional_info;
    @JsonProperty("certificate_number")
    private String certificate_number;
    @JsonProperty("category")
    private String category;

    @JsonProperty("certificate_state")
    private Integer certificate_state;
    @JsonProperty("certificate_given_date")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date certificate_given_date;
    @JsonProperty("certificate_expired_date")
    @JsonFormat(pattern = "yyyy-dd-MM")
    private Date certificate_expired_date;


    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public String getPnfl() {
        return pnfl;
    }

    public void setPnfl(String pnfl) {
        this.pnfl = pnfl;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Integer getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getPassport_given_date() {
        return passport_given_date;
    }

    public void setPassport_given_date(Date passport_given_date) {
        this.passport_given_date = passport_given_date;
    }

    public String getPassport_given_from() {
        return passport_given_from;
    }

    public void setPassport_given_from(String passport_given_from) {
        this.passport_given_from = passport_given_from;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getExperience_work() {
        return experience_work;
    }

    public void setExperience_work(String experience_work) {
        this.experience_work = experience_work;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public String getCertificate_number() {
        return certificate_number;
    }

    public void setCertificate_number(String certificate_number) {
        this.certificate_number = certificate_number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getCertificate_state() {
        return certificate_state;
    }

    public void setCertificate_state(Integer certificate_state) {
        this.certificate_state = certificate_state;
    }

    public Date getCertificate_given_date() {
        return certificate_given_date;
    }

    public void setCertificate_given_date(Date certificate_given_date) {
        this.certificate_given_date = certificate_given_date;
    }

    public Date getCertificate_expired_date() {
        return certificate_expired_date;
    }

    public void setCertificate_expired_date(Date certificate_expired_date) {
        this.certificate_expired_date = certificate_expired_date;
    }
}
