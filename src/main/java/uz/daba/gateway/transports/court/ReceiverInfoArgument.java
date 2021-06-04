package uz.daba.gateway.transports.court;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReceiverInfoArgument extends BaseCourtArgument {

    @JsonProperty("obj_id")
    private Integer obj_id;
    @JsonProperty("astate")
    private Integer astate;
    @JsonProperty("object_type")
    private Integer object_type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("region_id")
    private Integer region_id;
    @JsonProperty("area_id")
    private Integer area_id;
    @JsonProperty("address")
    private String address;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("created_year")
    private Integer created_year;
    @JsonProperty("total_square")
    private Integer total_square;
    @JsonProperty("build_square")
    private Integer build_square;
    @JsonProperty("materials")
    private String materials;
    @JsonProperty("condition_sum1")
    private Integer condition_sum1;
    @JsonProperty("condition_sum2")
    private Integer condition_sum2;
    @JsonProperty("have1")
    private Integer have1;
    @JsonProperty("have2")
    private Integer have2;
    @JsonProperty("have3")
    private Integer have3;
    @JsonProperty("realize_begin_org_inn")
    private String realize_begin_org_inn;
    @JsonProperty("position")
    private String position;

    public Integer getObj_id() {
        return obj_id;
    }

    public void setObj_id(Integer obj_id) {
        this.obj_id = obj_id;
    }

    public Integer getAstate() {
        return astate;
    }

    public void setAstate(Integer astate) {
        this.astate = astate;
    }

    public Integer getObject_type() {
        return object_type;
    }

    public void setObject_type(Integer object_type) {
        this.object_type = object_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getCreated_year() {
        return created_year;
    }

    public void setCreated_year(Integer created_year) {
        this.created_year = created_year;
    }

    public Integer getTotal_square() {
        return total_square;
    }

    public void setTotal_square(Integer total_square) {
        this.total_square = total_square;
    }

    public Integer getBuild_square() {
        return build_square;
    }

    public void setBuild_square(Integer build_square) {
        this.build_square = build_square;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public Integer getCondition_sum1() {
        return condition_sum1;
    }

    public void setCondition_sum1(Integer condition_sum1) {
        this.condition_sum1 = condition_sum1;
    }

    public Integer getCondition_sum2() {
        return condition_sum2;
    }

    public void setCondition_sum2(Integer condition_sum2) {
        this.condition_sum2 = condition_sum2;
    }

    public Integer getHave1() {
        return have1;
    }

    public void setHave1(Integer have1) {
        this.have1 = have1;
    }

    public Integer getHave2() {
        return have2;
    }

    public void setHave2(Integer have2) {
        this.have2 = have2;
    }

    public Integer getHave3() {
        return have3;
    }

    public void setHave3(Integer have3) {
        this.have3 = have3;
    }

    public String getRealize_begin_org_inn() {
        return realize_begin_org_inn;
    }

    public void setRealize_begin_org_inn(String realize_begin_org_inn) {
        this.realize_begin_org_inn = realize_begin_org_inn;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
