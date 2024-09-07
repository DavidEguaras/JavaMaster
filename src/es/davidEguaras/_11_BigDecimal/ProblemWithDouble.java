package es.davidEguaras._11_BigDecimal;

import java.math.BigDecimal;

public class ProblemWithDouble {
    public static void main(String[] args) {
        //double number1 = 0.02;
        //double number2 = 0.03;
        //wrong result, it will print something like 0.00999999998
        //double result = number1 - number2;

        BigDecimal number1 = new BigDecimal("0.02");
        BigDecimal number2 = new BigDecimal("0.03");
        BigDecimal result = number2.subtract(number1);
        System.out.println(result);

    }
}
