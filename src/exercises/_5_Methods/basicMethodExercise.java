package exercises._5_Methods;

//Write a method which takes two numbers as arguments and prints their sum to the terminal.

public class basicMethodExercise {
    public static int addTwoNumbers(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        int x = 5;
        int y = 10;

        System.out.println(addTwoNumbers(x, y));
    }
}
