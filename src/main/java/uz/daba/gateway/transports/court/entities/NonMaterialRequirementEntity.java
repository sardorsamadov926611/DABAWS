package uz.daba.gateway.transports.court.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.BaseEntity;

public class NonMaterialRequirementEntity extends BaseEntity {
    @JsonProperty("nonMaterialRequirementType")
    private Integer nonMaterialRequirementType;
    @JsonProperty("nonMaterialRequirementParticipant")
    private String nonMaterialRequirementParticipant;

    public Integer getNonMaterialRequirementType() {
        return nonMaterialRequirementType;
    }

    public void setNonMaterialRequirementType(Integer nonMaterialRequirementType) {
        this.nonMaterialRequirementType = nonMaterialRequirementType;
    }

    public String getNonMaterialRequirementParticipant() {
        return nonMaterialRequirementParticipant;
    }

    public void setNonMaterialRequirementParticipant(String nonMaterialRequirementParticipant) {
        this.nonMaterialRequirementParticipant = nonMaterialRequirementParticipant;
    }
}
