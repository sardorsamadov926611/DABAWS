package uz.daba.gateway.transports.birja;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.auction.BaseAuctionArgument;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BExchangeInfoArgument extends BaseAuctionArgument {

    @JsonProperty("sellerName")
    private String sellerName;
    @JsonProperty("sellerInn")
    private String sellerInn;
    @JsonProperty("nameCommod")
    private String nameCommod;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("baseAmount")
    private Double baseAmount;
    @JsonProperty("dealAmount")
    private Double dealAmount;
    @JsonProperty("avgPrice")
    private Double avgPrice;
    @JsonProperty("dealSum")
    private Double dealSum;
    @JsonProperty("period")
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date period;


    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerInn() {
        return sellerInn;
    }

    public void setSellerInn(String sellerInn) {
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

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }
}
