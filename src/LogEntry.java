import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogEntry {

    final String ip;
    final LocalDateTime datetime;
    final HttpMethod method;
    final String path;
    final int responce_code;
    final int responce_size;
    final String referer;
    final String user_agent;

    public LogEntry(String str) {
        Pattern pattern = Pattern.compile("([0-9,\\.]+) (-|\"\") (-|\"\") \\[(.+?)\\] \"(.*?)\" ([0-9]{3}) ([0-9]+?) (\".*?\") (\".*?\")");
        Matcher m = pattern.matcher(str);
        String ip1 = null;
        LocalDateTime datetime1 = null;
        HttpMethod method1 = null;
        String path1 = null;
        int responce_code1 = 0;
        int responce_size1 = 0;
        String referer1 = null;
        String user_agent1 = null;
        if (m.find()) {
            ip1 = m.group(1);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy:HH:mm:ss xx", Locale.US);
            datetime1 = LocalDateTime.parse(m.group(4),formatter);
            String method_path_protocol = m.group(5);
            String[] tmp = method_path_protocol.split(" ");
            method1 = HttpMethod.valueOf(tmp[0]);
            path1 = tmp[1];
            responce_code1 = Integer.parseInt(m.group(6));
            responce_size1 = Integer.parseInt(m.group(7));
            referer1 = m.group(8);
            user_agent1 = m.group(9);
        }
        ip = ip1;
        datetime = datetime1;
        method = method1;
        path = path1;
        responce_code = responce_code1;
        responce_size = responce_size1;
        referer = referer1;
        user_agent = user_agent1;
    }

    public String getIp() {
        return ip;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public int getResponce_code() {
        return responce_code;
    }

    public int getResponce_size() {
        return responce_size;
    }

    public String getReferer() {
        return referer;
    }

    public String getUser_agent() {
        return user_agent;
    }
}
