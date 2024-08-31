package _4_LoopsAndConditionals;

public class IfsIntro {
    public static void main(String[] args) {
        int number = 10;

        // Basic if statement
        System.out.println("Basic If Statement:");
        if (number > 5) {
            System.out.println("Number is greater than 5");
        }
        System.out.println();

        // If-else statement
        System.out.println("If-Else Statement:");
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        System.out.println();

        // If-else-if ladder
        System.out.println("If-Else-If Ladder:");
        if (number > 0 && number < 10) {
            System.out.println("Number is between 1 and 9");
        } else if (number >= 10 && number < 20) {
            System.out.println("Number is between 10 and 19");
        } else {
            System.out.println("Number is 20 or greater");
        }
        System.out.println();

        // Nested if statements
        System.out.println("Nested If Statement:");
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Number is positive and even");
            } else {
                System.out.println("Number is positive and odd");
            }
        } else {
            System.out.println("Number is non-positive");
        }
        System.out.println();

        // Using ternary operator (short form of if-else)
        System.out.println("Ternary Operator:");

        //               condition      if condition = true    if condition = false
        String result = (number > 0) ? "Number is positive" : "Number is non-positive";
        System.out.println(result);
    }
}
