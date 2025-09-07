// Program to display current time in different time zones
import java.time.*;

public class TimeZonesExample {
    public static void main(String[] args) {
        // Current time in GMT
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " + gmt);

        // Current time in IST (Indian Standard Time)
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST: " + ist);

        // Current time in PST (Pacific Standard Time)
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Time in PST: " + pst);
    }
}
