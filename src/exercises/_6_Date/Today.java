package exercises._6_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//Print today's Date and Time using LocalDate and LocalDateTime
public class Today {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());

        //Define a custom date and time format using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("----USING DATE-TIME FORMATTERS----");
        System.out.println(LocalDateTime.now().format(dateTimeFormatter));
        System.out.println(LocalDate.now().format(dateFormatter));

    }
}
