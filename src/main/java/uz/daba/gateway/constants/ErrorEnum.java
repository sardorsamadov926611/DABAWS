package uz.daba.gateway.constants;

import java.util.ResourceBundle;

public enum ErrorEnum {


    /**
     * Error data request
     */

    ERROR_DATA_REQUEST(2, "error.error_data_request"),

    /**
     * Error create data
     */

    ERROR_CREATE(3, "error.create_data"),


    /**
     * Error create data
     */

    ERROR_SERVICE(4, "error.common_error"),


    DB_NOT_AVAILABLE(5, "error.db.cannot_connect"),


    /**
     * User state is disabled
     */
    USER_STATE_DISABLED(6, "error.auth.state_disabled"),


    /**
     * User not found in DB
     */
    USER_NOT_FOUND(7, "error.auth.user_not_found"),

    /**
     * login not found
     */
    USER_LOGIN_NOT_FOUND(8, "error.auth.login_not_found"),

    /**
     * login not found
     */
    USER_PASSWORD_NOT_FOUND(9, "error.auth.password_not_found"),


    /**
     * data not found
     */

    DATA_NOT_FOUND(10, "error.data_not_found"),

    /**
     * login password not found
     */
    USER_LOGIN_PASSWORD_NOT_FOUND(11, "error.auth.login_password_not_found");


    /**
     * Universal Error STATUS
     * !!! Don't use this
     */
    public static final int HTTP_STATUS_ERROR_CODE = 555;

    /**
     * Force Update error status
     */
    public static final int HTTP_STATUS_FORCE_UPDATE = 556;

    private int code;
    private String message;

    ErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ErrorEnum getByCode(Integer code) {
        if (code == null) {
            return ERROR_SERVICE;
        }
        for (ErrorEnum value : values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        return ERROR_SERVICE;
    }

    public int getCode() {
        return code;
    }

    public String getMessage(ResourceBundle rb) {
        return rb.getString(message);
    }
}
