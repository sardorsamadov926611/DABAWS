package uz.daba.gateway.transports.government;

import com.fasterxml.jackson.annotation.JsonProperty;
import uz.daba.gateway.transports.court.BaseCourtResult;

import java.util.List;

public class GovernmentInfoResult extends BaseCourtResult {


    @JsonProperty("infos")
    List<GovInfoBean> infos;

    public List<GovInfoBean> getInfos() {
        return infos;
    }

    public void setInfos(List<GovInfoBean> infos) {
        this.infos = infos;
    }
}
