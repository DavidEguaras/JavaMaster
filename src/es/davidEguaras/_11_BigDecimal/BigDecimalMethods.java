package es.davidEguaras._11_BigDecimal;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class BigDecimalMethods {
    public static void main(String[] args) {
        BigDecimal number = BigDecimal.TEN;
        System.out.println(number);
        System.out.println(number.add(BigDecimal.ONE));
        System.out.println(number.max(BigDecimal.ZERO));
        System.out.println(number.compareTo(BigDecimal.ZERO));
        System.out.println(number.compareTo(new BigDecimal("11")));
    }
}
