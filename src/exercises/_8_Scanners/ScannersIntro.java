package exercises._8_Scanners;

import java.util.Scanner;

public class ScannersIntro {

    public static void main(String[] args) {
        // Create a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);

        // Reading an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered the integer: " + number);

        // Reading a floating point number (double)
        System.out.print("Enter a floating-point number: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered the floating-point number: " + decimal);

        // Reading a single word (String)
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("You entered the word: " + word);

        // Reading a full line (String)
        scanner.nextLine(); // This consumes the leftover newline character from previous input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered the sentence: " + sentence);

        // Closing the Scanner
        scanner.close();
    }
}

