package es.davidEguaras._13_ExceptionHandling;

public class CustomExceptions {

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0)); // This will throw the custom unchecked exception
        } catch (MyCustomUncheckedException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    // Custom unchecked exception (runtime)
    public static class MyCustomUncheckedException extends RuntimeException {
        public MyCustomUncheckedException(String message) {
            super(message);
        }
    }

    // Custom checked exception
    public static class MyCustomCheckedException extends Exception {
        public MyCustomCheckedException(String message) {
            super(message);
        }
    }

    // Static divide method
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new MyCustomUncheckedException("Cannot divide by 0");
            //throw new MyCustomCheckedException("Cannot divide by 0");
        }
        return (a / b);
    }
}

