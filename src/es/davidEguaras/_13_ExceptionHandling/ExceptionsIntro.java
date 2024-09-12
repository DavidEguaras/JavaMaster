package es.davidEguaras._13_ExceptionHandling;

public class ExceptionsIntro {
    public static void main(String[] args) {

        // Handling ArithmeticException (division by zero)
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Division by zero
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (Exception e){
            //We can catch all exceptions, but it is better to be specific so the debug process is more easy and manageable
            System.out.println("Error");
        }
        // finally(keyword) will always execute regardless
        // mainly used for cleanup purposes
        finally {
            System.out.println("Finally always runs.");
        }

        //we can also use a OR on a catch:
        // catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
        //    System.out.println("Error: " + e.getMessage());
        //}
    }
}
