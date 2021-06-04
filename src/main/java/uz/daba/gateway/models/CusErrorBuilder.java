package uz.daba.gateway.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.ws.rs.core.Response;
import java.util.ResourceBundle;

public class CusErrorBuilder {

    @JsonProperty("ERROR")
    private String error;
    private ResourceBundle rb;

    private CusErrorBuilder(ResourceBundle resourceBundle) {
        this.rb = resourceBundle;
    }

    public static CusErrorBuilder newInstance(ResourceBundle resourceBundle) {
        return new CusErrorBuilder(resourceBundle);
    }


    public CusErrorBuilder ERROR(String errorMsg) {
        this.error = errorMsg;
        return this;
    }


    public Response build(Integer code) {
        ErrorMsg entity = new ErrorMsg(code, error);
        return Response.status(code).entity(entity).build();
    }

}
