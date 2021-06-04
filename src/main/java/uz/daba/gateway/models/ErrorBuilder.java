package uz.daba.gateway.models;

import uz.daba.gateway.constants.ErrorEnum;
import uz.daba.gateway.utils.Utils;

import javax.ws.rs.core.Response;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class ErrorBuilder {
    private int status;
    private int code;
    private String message;

    private ResourceBundle rb;

    private ErrorBuilder(ResourceBundle resourceBundle) {
        this.rb = resourceBundle;
    }

    public static ErrorBuilder newInstance(ResourceBundle resourceBundle) {
        return new ErrorBuilder(resourceBundle);
    }

    /**
     * This method use for any error
     */
    public ErrorBuilder ERROR(ErrorEnum errorEnum) {
        return ERROR(errorEnum, null);
    }

    public ErrorBuilder ERROR(ErrorEnum errorEnum, String description) {
        this.status = ErrorEnum.HTTP_STATUS_ERROR_CODE;
        this.code = errorEnum.getCode();
        this.message = String.format(Locale.US, "%s.", errorEnum.getMessage(rb));
        return this;
    }

    public ErrorBuilder ERROR(Integer errorCode, String errorMsg) {
        this.status = ErrorEnum.HTTP_STATUS_ERROR_CODE;
        this.code = errorCode;
        this.message = errorMsg;
        return this;
    }

    public ErrorBuilder ERROR(Map<String, Object> m) {
        this.status = ErrorEnum.HTTP_STATUS_ERROR_CODE;
        this.code = Utils.parseInt(m.get("p_result"));
        this.message = (String) m.get("p_res_msg");
        return this;
    }

    public ErrorBuilder ERROR(String errorMsg) {
        this.message = errorMsg;
        return this;
    }


    /**
     * This method only for user not in session
     */
    public ErrorBuilder UNAUTHORIZED(ErrorEnum errorEnum) {
        return UNAUTHORIZED(errorEnum, null);
    }

    public ErrorBuilder UNAUTHORIZED(ErrorEnum errorEnum, String description) {
        return ANY_ERROR(Response.Status.UNAUTHORIZED.getStatusCode(), errorEnum, description);
    }

    /**
     * This is custom error
     * If you want to make custom error then use it, else
     * !!! don't use it
     */
    public ErrorBuilder ANY_ERROR(int status, ErrorEnum errorEnum) {
        return ANY_ERROR(status, errorEnum, null);
    }

    public ErrorBuilder ANY_ERROR(int status, ErrorEnum errorEnum, String description) {
        this.status = status;
        this.code = errorEnum.getCode();
        this.message = errorEnum.getMessage(rb);
        return this;
    }

    public Response build() {
        ErrorMsg entity = new ErrorMsg(code, message);
        return Response.status(status).entity(entity).build();
    }

}
