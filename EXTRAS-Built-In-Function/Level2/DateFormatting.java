// Program to format current date in different styles
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Format: dd/MM/yyyy
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Format 1: " + today.format(f1));

        // Format: yyyy-MM-dd
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Format 2: " + today.format(f2));

        // Format: EEE, MMM dd, yyyy
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Format 3: " + today.format(f3));
    }
}
