package uz.daba.gateway.utils;


import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Map;

public class CustomException extends IOException {
    private final Integer resCode;
    private final String resMsg;
    private final String sysMsg;

    public CustomException() {
        this.resCode = -999;
        this.resMsg = "Tizim xatoligi";
        this.sysMsg = "System error";
    }

    public CustomException(Throwable th) {
        super(th);
        this.resCode = -1000;
        this.resMsg = th.getLocalizedMessage();
        this.sysMsg = th.getMessage();
    }

    public CustomException(String resMsg) {
        this.resCode = -988;
        this.resMsg = resMsg;
        this.sysMsg = resMsg;
    }

    public CustomException(Integer resCode, String resMsg) {
        this.resCode = resCode;
        this.resMsg = resMsg;
        this.sysMsg = resMsg;
    }

    public CustomException(Integer resCode, String resMsg, String sysMsg) {
        this.resCode = resCode;
        this.resMsg = resMsg;
        this.sysMsg = sysMsg;
    }

    public CustomException(Map<String, Object> m) {
        this.resCode = Utils.getResCode(m);
        this.resMsg = Utils.getResMsg(m);
        this.sysMsg = Utils.getSysMsg(m);
    }



    public CustomException(Response.StatusType statusInfo) {
        this.resCode = statusInfo.getStatusCode();
        this.resMsg = statusInfo.getReasonPhrase();
        this.sysMsg = statusInfo.getReasonPhrase();
    }


    public Integer getResCode() {
        return resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public String getSysMsg() {
        return sysMsg;
    }
}
