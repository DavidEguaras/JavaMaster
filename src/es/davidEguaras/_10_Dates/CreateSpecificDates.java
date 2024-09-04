package es.davidEguaras._10_Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreateSpecificDates {
    public static void main(String[] args) {
        LocalDateTime someDate = LocalDateTime.of(
                2000,
                Month.DECEMBER,
                1,
                14,
                55,
                22
        );
        //same with localDate
        LocalDate someDate2 = LocalDate.of(
                2000,
                Month.DECEMBER,
                1
        );
        //same with localTime
        LocalTime someTime = LocalTime.of(
                12,
                55,
                55
        );


    }
}
