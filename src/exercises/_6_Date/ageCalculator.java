package exercises._6_Date;

//Write a method that calculate age on any given date

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class ageCalculator {

    public static int calculateAge(String birthdayDateStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //parse string to date
        LocalDate birthdayDate = LocalDate.parse(birthdayDateStr, formatter);
        //use the Period class and the method between to calculate time difference
        Period period = Period.between(birthdayDate, LocalDate.from(LocalDateTime.now()));
        //since we want to know the age, we get the time period difference between now and the birthday only in years
        return period.getYears();
    }

    public static void main(String[] args) {
        String birthday = "2004-12-16";
        int yearsOld = calculateAge(birthday);
        System.out.println("You are: " +yearsOld+ " years old");
    }
}
