package es.davidEguaras._7_Methods;

public class MethodsIntro {

    public static void main(String[] args) {
        // Calling a method that returns a value
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum);

        // Calling a method that doesn't return a value
        printMessage();

        // Calling a method with a parameter
        greet("Alice");

        // Checking if a number is even
        boolean isEven = checkEven(5);
        System.out.println("Is 5 even? " + isEven);
    }

    // Method that adds two numbers and returns the result
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Method that prints a message (no return value)
    public static void printMessage() {
        System.out.println("Hello, this is a simple message!");
    }

    // Method that takes a name as input and prints a greeting
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method that checks if a number is even and returns a boolean
    public static boolean checkEven(int number) {
        return number % 2 == 0;
    }
}
