package es.davidEguaras._12_UserInput;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        System.out.println("Hello, what's your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello, " +input);


        System.out.println("What is your age?: ");
        int age = scanner.nextInt();
        //there is also nextByte, nextDouble...
        System.out.println("you are " + age + " years old");
    }
}
