package es.davidEguaras._10_Dates;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeAndDate {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println("localDate = " + localDate);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getHour());
        System.out.println(localDate.getSecond());
        System.out.println(localDate.minusDays(5));
        //other methods

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        //it has more or less the same methods as LocalDate
    }
}
