package uz.daba.gateway.transports.birja;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.auction.BaseAuctionArgument;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BProcurementInfoArgument extends BaseAuctionArgument {

    @JsonProperty("type")
    private String type;
    @JsonProperty("lot_id")
    private Integer lot_id;
    @JsonProperty("start_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date start_date;
    @JsonProperty("end_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date end_date;
    @JsonProperty("deal_id")
    private Integer deal_id;
    @JsonProperty("deal_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date deal_date;
    @JsonProperty("count_orders")
    private Integer count_orders;
    @JsonProperty("category_id")
    private Integer category_id;
    @JsonProperty("product_name")
    private String product_name;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("one_price")
    private Double one_price;
    @JsonProperty("base_price")
    private Double base_price;
    @JsonProperty("country_id")
    private Integer country_id;
    @JsonProperty("deal_price")
    private Double deal_price;
    @JsonProperty("buyer_name")
    private String buyer_name;
    @JsonProperty("buyer_tin")
    private Integer buyer_tin;
    @JsonProperty("buyer_id")
    private Integer buyer_id;
    @JsonProperty("provider_name")
    private String provider_name;
    @JsonProperty("provider_tin")
    private Integer provider_tin;
    @JsonProperty("provider_id")
    private Integer provider_id;
    @JsonProperty("founder_fio")
    private String founder_fio;
    @JsonProperty("benefit_fio")
    private String benefit_fio;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLot_id() {
        return lot_id;
    }

    public void setLot_id(Integer lot_id) {
        this.lot_id = lot_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Integer getDeal_id() {
        return deal_id;
    }

    public void setDeal_id(Integer deal_id) {
        this.deal_id = deal_id;
    }

    public Date getDeal_date() {
        return deal_date;
    }

    public void setDeal_date(Date deal_date) {
        this.deal_date = deal_date;
    }

    public Integer getCount_orders() {
        return count_orders;
    }

    public void setCount_orders(Integer count_orders) {
        this.count_orders = count_orders;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getOne_price() {
        return one_price;
    }

    public void setOne_price(Double one_price) {
        this.one_price = one_price;
    }

    public Double getBase_price() {
        return base_price;
    }

    public void setBase_price(Double base_price) {
        this.base_price = base_price;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public Double getDeal_price() {
        return deal_price;
    }

    public void setDeal_price(Double deal_price) {
        this.deal_price = deal_price;
    }

    public String getBuyer_name() {
        return buyer_name;
    }

    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }

    public Integer getBuyer_tin() {
        return buyer_tin;
    }

    public void setBuyer_tin(Integer buyer_tin) {
        this.buyer_tin = buyer_tin;
    }

    public Integer getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(Integer buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public Integer getProvider_tin() {
        return provider_tin;
    }

    public void setProvider_tin(Integer provider_tin) {
        this.provider_tin = provider_tin;
    }

    public Integer getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(Integer provider_id) {
        this.provider_id = provider_id;
    }

    public String getFounder_fio() {
        return founder_fio;
    }

    public void setFounder_fio(String founder_fio) {
        this.founder_fio = founder_fio;
    }

    public String getBenefit_fio() {
        return benefit_fio;
    }

    public void setBenefit_fio(String benefit_fio) {
        this.benefit_fio = benefit_fio;
    }
}
