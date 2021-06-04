package uz.daba.gateway.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Utils {
    private static String OS = System.getProperty("os.name").toLowerCase();


    public static String getFpUniversalPassword() {
        String retval = "";
        Date cur_date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            retval = "ilforest" + sdf.format(cur_date).replace(".", "");
        } catch (Exception ignored) {
        }
        return retval;
    }

    public static String getStringDigest(String password) {
        String s = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA1");
            digest.update(password.getBytes());
            s = toHexString(digest.digest()).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            //
        }
        return s;
    }

    private static String toHexString(byte[] block) {
        StringBuffer buf = new StringBuffer();
        int len = block.length;
        for (byte aBlock : block) {
            byte2hex(aBlock, buf);
        }

        return buf.toString();
    }

    private static void byte2hex(byte b, StringBuffer buf) {
        char[] hexChars = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'
        };
        int high = (b & 0xf0) >> 4;
        int low = b & 0xf;
        buf.append(hexChars[high]);
        buf.append(hexChars[low]);
    }

    public static RowBounds parseRowBounds(Map<String, Object> params) {
        Integer page = Utils.parseInt(params.get("page"));
        Integer perPage = Utils.parseInt(params.get("perPage"));
        if (page == null || perPage == null) {
            return RowBounds.DEFAULT;
        }
        return new RowBounds((page - 1) * perPage, perPage);
    }

    public static Integer parseInt(Object obj) {
        return parseInt(obj, null);
    }

    public static Integer parseInt(Object obj, Integer defValue) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Double) {
            return ((Double) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).intValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        try {
            return Integer.parseInt(String.valueOf(obj));
        } catch (Exception ex) {
            return defValue;
        }
    }

    public static Response toResponse() {
        return toResponse(null);
    }

    public static <T> Response toResponse(T object) {
        return Response
                .ok(object)
                .build();
    }

    public static String toString(Object obj) {
        return obj == null ? null : String.valueOf(obj);
    }


    public static boolean isNotSuccess(Map<String, Object> resMap) {
        return !isSuccess(resMap);
    }

    public static boolean isNotSuccess(Map<String, Object> resMap, String key) {
        return !isSuccess(resMap, key);
    }

    public static boolean isSuccess(Map<String, Object> resMap) {
        return isSuccess(resMap, "p_result");
    }

    public static boolean isSuccess(Map<String, Object> resMap, String key) {
        if (resMap == null || !resMap.containsKey(key)) {
            return false;
        }
        return Utils.parseInt(resMap.get(key), -1) == 0;
    }

    public static String getResMsg(Map<String, Object> resMap) {
        return (String) resMap.get("p_res_msg");
    }

    public static String getSysMsg(Map<String, Object> resMap) {
        return (String) resMap.get("p_sys_msg");
    }

    public static Integer getResCode(Map<String, Object> resMap) {
        return Utils.parseInt(resMap.get("p_result"), null);
    }

    public static Integer getNewId(Map<String, Object> resMap) {
        return Utils.parseInt(resMap.get("p_new_id"), null);
    }

    public static Date convert(Long millis) {
        return new Date(millis);
    }

    public static String convertToString(Long millis) {
        if (millis == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(millis);
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(c.getTime());
    }

    public static Double extractNumber(String text, Double defValue) {
        if (StringUtils.isBlank(text)) {
            return defValue;
        }
        return parseDouble(text.replaceAll("[^0-9]", ""), defValue);
    }

    public static Double parseDouble(Object object, Double defValue) {
        if (object == null) {
            return defValue;
        }
        if (object instanceof Double) {
            return (Double) object;
        }
        try {
            return Double.parseDouble(String.valueOf(object));
        } catch (Exception ignored) {

        }
        return defValue;
    }


    public static boolean isUnix() {

        return (OS.contains("nix") || OS.contains("nux") || OS.indexOf("aix") > 0);

    }

    public static boolean isWindows() {

        return (OS.contains("win"));

    }

    public static Map<String, Object> generateParametersMap(Object... objs) {
        Map<String, Object> m = new HashMap<>();
        m.put("system_language", "ru");
        ObjectMapper om = new ObjectMapper();
        for (Object obj : objs) {
            if (obj instanceof MultivaluedMap) {
                MultivaluedMap<String, Object> mm = (MultivaluedMap) obj;

                for (Object o : mm.keySet()) {
                    String key = (String) o;
                    m.put(key, mm.getFirst(key));
                }
            } else {
                m.putAll(om.convertValue(obj, Map.class));
            }

        }
        return m;
    }


}
