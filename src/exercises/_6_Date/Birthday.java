package exercises._6_Date;


import java.time.LocalDate;
import java.time.Month;

//-Represent your date of birth using LocalDate 🎂
//-Then add 100 days to your date of birth and print it
public class Birthday {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(
                2004,
                Month.DECEMBER,
                16
        );
        System.out.println("birthday = " + birthday);

        LocalDate plusHundredBirthday = birthday.plusDays(100);
        System.out.println("plusHundredBirthday = " + plusHundredBirthday);
    }
}
