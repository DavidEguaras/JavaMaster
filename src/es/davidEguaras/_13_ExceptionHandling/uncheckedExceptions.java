package es.davidEguaras._13_ExceptionHandling;

public class uncheckedExceptions {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero. This is an unchecked exception.");
        }
    }
}
