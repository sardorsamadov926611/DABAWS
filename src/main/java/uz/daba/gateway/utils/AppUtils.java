package uz.daba.gateway.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import uz.daba.gateway.constants.AConst;
import uz.daba.gateway.transports.court.ReceiverInfoResult;

import javax.ws.rs.core.Response;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppUtils {


    public static ReceiverInfoResult getReceverInfoResult(String key, String value, SqlSession sqlSession) {
        List<ReceiverInfoResult> result;
        Map<String, Object> m = new HashMap<>();
        m.put(key, value);
        result = sqlSession.selectList("selectReceiverInfo", m);
        if (result.size() == 0) {
            return null;
        }
        return result.get(0);
    }

    public static long saveFile(byte[] fileByte, Integer fileName, String fileDic) {

        try (InputStream in = new ByteArrayInputStream(fileByte)) {
            File file = AppUtils.convertResourceToFile(AConst.fileWindowsPath, AConst.fileServerPath, fileDic, fileName, "pdf");

            AppUtils.saveResourceFile(file, in);

            return file.length();
        } catch (IOException ex) {
            return 0;
        }
    }


    public static void saveResourceFile(File file, InputStream in) throws IOException {
        File directory = file.getParentFile();
        if (!directory.exists()) {
            directory.mkdirs();
        }
        Files.copy(in, Paths.get(file.getAbsolutePath()));
    }

    public static File convertResourceToFile(String path, String serverPath, String fileDic, Integer resourceId, String extension) {
        return new File(Utils.isWindows() ? path + fileDic + "/" : serverPath + fileDic + "/", String.format("%d.%s", resourceId, StringUtils.trimToEmpty(extension)));
    }

    public static String headerAuth(String login, String password) {
        return "Basic " + Base64.encodeBase64String((login + ":" + password).getBytes());
    }

    public static void checkResponseStatusOrThrow(Response resp) throws CustomException {
        if (resp.getStatus() == Response.Status.OK.getStatusCode()) {
            return;
        }
        throw new CustomException(resp.getStatusInfo());
    }
}
