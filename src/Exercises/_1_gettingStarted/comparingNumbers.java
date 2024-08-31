package Exercises._1_gettingStarted;
/*
Write a program that compares two numbers. Use any comparison operator
Create 3 variables.
2 variables to store both numbers and 1 variable store the result
Print the result
*/
public class comparingNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 9;
        String result = "";

        if(x > y){
            result = "x is bigger than y";
        }else if(x == y){
            result = "x is equal to y";
        }else{
            result = "y is bigger than x";
        }

        System.out.println(result);

    }
}
