package uz.daba.gateway.models;

import uz.daba.gateway.constants.ErrorEnum;

import javax.ws.rs.core.Response;

public class ErrorMsg extends BaseModel {

    private final int result_code;
    private final String result_message;

    public ErrorMsg(int code, String message) {
        this.result_code = code;
        this.result_message = message;
    }

    public ErrorMsg(Response responseStringEntity) {
        this.result_code = ErrorEnum.ERROR_SERVICE.getCode();
        this.result_message = (String) responseStringEntity.getEntity();
    }

    public int getResult_code() {
        return result_code;
    }

    public String getResult_message() {
        return result_message;
    }

    public Response generateResponse() {
        return Response.status(this.result_code).entity(this).build();
    }

}
