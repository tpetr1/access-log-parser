import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class Statistics {

    int totalTraffic = 0;
    LocalDateTime minTime = LocalDateTime.of(2047, 07, 06, 23, 30, 00);
    LocalDateTime maxTime = LocalDateTime.of(1917, 07, 06, 23, 30, 00);
    HashSet<String> pages = new HashSet<>();
    HashMap<String, Integer> osStatistic = new HashMap<>();
    HashSet<String> nonExistentPages = new HashSet<>();
    HashMap<String, Integer> browserStatistic = new HashMap<>();
    int countVisits = 0;
    int errorCount = 0;
    HashSet<String> uniqueUsers = new HashSet<>();
    HashMap<Integer, Integer> requestsPerSecond = new HashMap<>();

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
        if (le.responce_code == 404) {
            nonExistentPages.add(le.path);
        }
        String a = Integer.toString(le.responce_code);
        if (a.charAt(0) == '5' || a.charAt(0) == '4') {
            errorCount++;
        }
        UserAgent us = new UserAgent(le.user_agent);
        String os = us.getOs();
        if (os!=null) {
            if (!osStatistic.containsKey(os)) {
                osStatistic.put(os, 1);
            } else {
                osStatistic.replace(os, osStatistic.get(os) + 1);
            }
        }
        String browser = us.getBrowser();
        if (browser!=null) {
            if (!browserStatistic.containsKey(browser)) {
                browserStatistic.put(browser, 1);
            } else {
                browserStatistic.replace(browser, browserStatistic.get(browser) + 1);
            }
        }
        if (!us.isBot()){
            countVisits++;
        }
        if (le.ip!=null&&!us.isBot()) {
            if (!uniqueUsers.contains(le.ip)) {
                uniqueUsers.add(le.ip);
            }
        }
    }

    public double getTrafficRate() {
        return (double) totalTraffic / logDuration();
    }

    private double logDuration(){
        return (double) Duration.between(minTime, maxTime).toMillis() / 3600000.0;
    }
    public HashSet<String> getPages() {
        return pages;
    }

    public HashSet<String> getNonExistentPages() {
        return nonExistentPages;
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

    public HashMap<String, Double> getBrowserStatistic() {
        HashMap<String, Double> browserStat = new HashMap<>();
        double sum = 0;
        for (String s : browserStatistic.keySet()){
            sum += (double)browserStatistic.get(s);
        }
        for (String s : browserStatistic.keySet()){
            browserStat.put(s, (double) browserStatistic.get(s)/sum);
        }
        return browserStat;
    }

    public double averageNumberVisitsUser(){
        return (double) countVisits/logDuration();
    }

    public double averageNumberErrors(){
        return (double) errorCount/logDuration();
    }

    public double statisticsOneUserVisits() {
        return countVisits/(double)uniqueUsers.size();
    }
}
