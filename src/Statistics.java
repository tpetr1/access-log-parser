import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class Statistics {

    int totalTraffic = 0;
    LocalDateTime minTime = LocalDateTime.of(2047, 07, 06, 23, 30, 00);
    ;
    LocalDateTime maxTime = LocalDateTime.of(1917, 07, 06, 23, 30, 00);
    HashSet<String> pages = new HashSet<>();
    HashMap<String, Integer> osStatistic = new HashMap<>();

    public Statistics() {
    }

    public void addEntry(LogEntry le) {
        totalTraffic += le.getResponce_size();
        if (le.datetime.isAfter(maxTime)) {
            maxTime = le.datetime;
        }
        if (le.datetime.isBefore(minTime)) {
            minTime = le.datetime;
        }
        if (le.responce_code == 200) {
            pages.add(le.path);
        }
        String os = new UserAgent(le.user_agent).getOs();
        if (os!=null) {
            if (!osStatistic.containsKey(os)) {
                osStatistic.put(os, 1);
            } else {
                osStatistic.replace(os, osStatistic.get(os) + 1);
            }
        }
    }

    public double getTrafficRate() {
        double d = (double) Duration.between(minTime, maxTime).toMillis() / 3600000.0;
        return (double) totalTraffic / d;
    }

    public HashSet<String> getPages() {
        return pages;
    }

    public HashMap<String, Double> getOsStatistic() {
        HashMap<String, Double> osStat = new HashMap<>();
        double sum = 0;
        for (String s : osStatistic.keySet()){
            sum += (double)osStatistic.get(s);
        }
        for (String s : osStatistic.keySet()){
            osStat.put(s, (double) osStatistic.get(s)/sum);
        }
        return osStat;
    }
}
