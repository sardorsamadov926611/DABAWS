package uz.daba.gateway.transports.auction;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SellDataArgument extends BaseAuctionArgument {

    @JsonProperty("order_id")
    private Integer order_id;
    @JsonProperty("confiscants_id")
    private Integer confiscants_id;
    @JsonProperty("order_statuses_id")
    private Integer order_statuses_id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("region")
    private String region;
    @JsonProperty("area")
    private String area;
    @JsonProperty("group_name")
    private String group_name;
    @JsonProperty("category_name")
    private String category_name;
    @JsonProperty("joylashgan_manzil")
    private String joylashgan_manzil;
    @JsonProperty("bank_name")
    private String bank_name;
    @JsonProperty("bank_mfo")
    private String bank_mfo;
    @JsonProperty("bank_xr")
    private String bank_xr;
    @JsonProperty("order_status")
    private Integer order_status;
    @JsonProperty("lot_number")
    private String lot_number;

    @JsonProperty("start_price")
    private Integer start_price;
    @JsonProperty("sold_price")
    private Integer sold_price;
    @JsonProperty("auction_date")
    @JsonFormat(pattern = "dd.MM.yyyy hh:mi")
    private Date auction_date;

    @JsonProperty("winner_name")
    private String winner_name;
    @JsonProperty("winner_inn")
    private String winner_inn;
    @JsonProperty("winner_passport")
    private String winner_passport;
    @JsonProperty("winner_passport_date")
    @JsonFormat(pattern = "dd.MM.yyyy hh:mi")
    private Date winner_passport_date;
    @JsonProperty("winner_passport_issued_by")
    private String winner_passport_issued_by;
    @JsonProperty("winner_subject_type")
    private String winner_subject_type;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getConfiscants_id() {
        return confiscants_id;
    }

    public void setConfiscants_id(Integer confiscants_id) {
        this.confiscants_id = confiscants_id;
    }

    public Integer getOrder_statuses_id() {
        return order_statuses_id;
    }

    public void setOrder_statuses_id(Integer order_statuses_id) {
        this.order_statuses_id = order_statuses_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getJoylashgan_manzil() {
        return joylashgan_manzil;
    }

    public void setJoylashgan_manzil(String joylashgan_manzil) {
        this.joylashgan_manzil = joylashgan_manzil;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_mfo() {
        return bank_mfo;
    }

    public void setBank_mfo(String bank_mfo) {
        this.bank_mfo = bank_mfo;
    }

    public String getBank_xr() {
        return bank_xr;
    }

    public void setBank_xr(String bank_xr) {
        this.bank_xr = bank_xr;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public String getLot_number() {
        return lot_number;
    }

    public void setLot_number(String lot_number) {
        this.lot_number = lot_number;
    }

    public Integer getStart_price() {
        return start_price;
    }

    public void setStart_price(Integer start_price) {
        this.start_price = start_price;
    }

    public Integer getSold_price() {
        return sold_price;
    }

    public void setSold_price(Integer sold_price) {
        this.sold_price = sold_price;
    }

    public Date getAuction_date() {
        return auction_date;
    }

    public void setAuction_date(Date auction_date) {
        this.auction_date = auction_date;
    }

    public String getWinner_name() {
        return winner_name;
    }

    public void setWinner_name(String winner_name) {
        this.winner_name = winner_name;
    }

    public String getWinner_inn() {
        return winner_inn;
    }

    public void setWinner_inn(String winner_inn) {
        this.winner_inn = winner_inn;
    }

    public String getWinner_passport() {
        return winner_passport;
    }

    public void setWinner_passport(String winner_passport) {
        this.winner_passport = winner_passport;
    }

    public Date getWinner_passport_date() {
        return winner_passport_date;
    }

    public void setWinner_passport_date(Date winner_passport_date) {
        this.winner_passport_date = winner_passport_date;
    }

    public String getWinner_passport_issued_by() {
        return winner_passport_issued_by;
    }

    public void setWinner_passport_issued_by(String winner_passport_issued_by) {
        this.winner_passport_issued_by = winner_passport_issued_by;
    }

    public String getWinner_subject_type() {
        return winner_subject_type;
    }

    public void setWinner_subject_type(String winner_subject_type) {
        this.winner_subject_type = winner_subject_type;
    }
}
