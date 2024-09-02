package exercises._5_Methods;
//-1
//Write a method which takes a number as an argument and returns that number negated, e.g.
// passing 5 as an argument should return -5; passing -10 should return 10.


public class numberInverter {

    public static int invertNumber(int number){
        return -number;
    }

    public static void main(String[] args) {
        int number1 = -10;
        int number2 = 20;

        System.out.println(invertNumber(number1));
        System.out.println(invertNumber(number2));
    }
}
