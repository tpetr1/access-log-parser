import java.time.Duration;
import java.time.LocalDateTime;

public class Statistics {

    int totalTraffic = 0;
    LocalDateTime minTime = LocalDateTime.of(2047, 07, 06, 23, 30, 00);;
    LocalDateTime maxTime = LocalDateTime.of(1917, 07, 06, 23, 30, 00);

    public Statistics() {
    }

    public void addEntry(LogEntry le){
        totalTraffic += le.getResponce_size();
        if (le.datetime.isAfter(maxTime)) {
            maxTime = le.datetime;
        }
        if (le.datetime.isBefore(minTime)){
            minTime = le.datetime;
        }
    }

    public double getTrafficRate(){
        double d = (double) Duration.between(minTime, maxTime).toMillis()/3600000.0;
        return (double) totalTraffic/ d;
    }
}
