package uz.daba.gateway.transports.custom;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class DeclarationEntity {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("G7_A")
    private String g7_a;
    @JsonProperty("G7_B")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date g7_b;
    @JsonProperty("G7_C")
    private String g7_c;
    @JsonProperty("G1_A")
    private String g1_a;
    @JsonProperty("G1_B")
    private String g1_b;
    @JsonProperty("G2_NAME")
    private String g2_name;
    @JsonProperty("G2_CODE2")
    private String g2_code2;
    @JsonProperty("G2_ADDRESS")
    private String g2_address;
    @JsonProperty("G8_NAME")
    private String g8_name;
    @JsonProperty("G8_CODE2")
    private String g8_code2;
    @JsonProperty("G8_ADDRESS")
    private String g8_address;
    @JsonProperty("Tovar")
    private List<DeclarationItemEntity> tovar;

    public DeclarationEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getG7_a() {
        return g7_a;
    }

    public void setG7_a(String g7_a) {
        this.g7_a = g7_a;
    }

    public Date getG7_b() {
        return g7_b;
    }

    public void setG7_b(Date g7_b) {
        this.g7_b = g7_b;
    }

    public String getG7_c() {
        return g7_c;
    }

    public void setG7_c(String g7_c) {
        this.g7_c = g7_c;
    }

    public String getG1_a() {
        return g1_a;
    }

    public void setG1_a(String g1_a) {
        this.g1_a = g1_a;
    }

    public String getG1_b() {
        return g1_b;
    }

    public void setG1_b(String g1_b) {
        this.g1_b = g1_b;
    }

    public String getG2_name() {
        return g2_name;
    }

    public void setG2_name(String g2_name) {
        this.g2_name = g2_name;
    }

    public String getG2_code2() {
        return g2_code2;
    }

    public void setG2_code2(String g2_code2) {
        this.g2_code2 = g2_code2;
    }

    public String getG2_address() {
        return g2_address;
    }

    public void setG2_address(String g2_address) {
        this.g2_address = g2_address;
    }

    public String getG8_name() {
        return g8_name;
    }

    public void setG8_name(String g8_name) {
        this.g8_name = g8_name;
    }

    public String getG8_code2() {
        return g8_code2;
    }

    public void setG8_code2(String g8_code2) {
        this.g8_code2 = g8_code2;
    }

    public String getG8_address() {
        return g8_address;
    }

    public void setG8_address(String g8_address) {
        this.g8_address = g8_address;
    }

    public List<DeclarationItemEntity> getTovar() {
        return tovar;
    }

    public void setTovar(List<DeclarationItemEntity> tovar) {
        this.tovar = tovar;
    }
}
