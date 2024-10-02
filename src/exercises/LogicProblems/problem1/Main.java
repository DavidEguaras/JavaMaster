package exercises.LogicProblems.problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;

        System.out.println("Enter a number in these fields greater than zero and less or equal to 100 to define the grid of the robot:");

        while(m == 0){
            System.out.println("Enter a valid m value :");
            Scanner scanner = new Scanner(System.in);
            int value1 = scanner.nextInt();
            if(value1 > 0 && value1 <= 100){
                m = value1;
            }
        }

        while(n == 0){
            System.out.println("Enter a valid n value :");
            Scanner scanner = new Scanner(System.in);
            int value2 = scanner.nextInt();
            if(value2 > 0 && value2 <= 100){
                n = value2;
            }
        }

        System.out.println(m);
        System.out.println(n);
    }
}
