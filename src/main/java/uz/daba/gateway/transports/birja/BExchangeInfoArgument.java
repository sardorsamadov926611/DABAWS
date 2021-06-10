package uz.daba.gateway.transports.birja;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.auction.BaseAuctionArgument;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BExchangeInfoArgument extends BaseAuctionArgument {

    @JsonProperty("SellerName")
    private String sellerName;
    @JsonProperty("SellerInn")
    private Integer sellerInn;
    @JsonProperty("NameCommod")
    private String nameCommod;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("BaseAmount")
    private Double baseAmount;
    @JsonProperty("DealAmount")
    private Double dealAmount;
    @JsonProperty("AvgPrice")
    private Double avgPrice;
    @JsonProperty("DealSum")
    private Double dealSum;
    @JsonProperty("Period")
    private Integer period;


    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getSellerInn() {
        return sellerInn;
    }

    public void setSellerInn(Integer sellerInn) {
        this.sellerInn = sellerInn;
    }

    public String getNameCommod() {
        return nameCommod;
    }

    public void setNameCommod(String nameCommod) {
        this.nameCommod = nameCommod;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(Double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public Double getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Double dealAmount) {
        this.dealAmount = dealAmount;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Double getDealSum() {
        return dealSum;
    }

    public void setDealSum(Double dealSum) {
        this.dealSum = dealSum;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }
}
