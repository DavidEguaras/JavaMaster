package es.davidEguaras._8_BeyondTheBasics;

public class WrapperClasses {
    public static void main(String[] args) {
        // Primitive data types
        int primitiveInt = 10;
        double primitiveDouble = 20.5;

        // Wrapper classes corresponding to primitive types
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Boxing (converting primitive to wrapper)
        Double wrapperDouble = Double.valueOf(primitiveDouble);

        // Autoboxing: Java automatically converts primitives to their corresponding wrapper objects
        Integer autoBoxedInt = primitiveInt; // Autoboxing
        Double autoBoxedDouble = primitiveDouble;

        // Unboxing: Java automatically converts wrapper objects back to primitives
        int unboxedInt = wrapperInt; // Unboxing
        double unboxedDouble = wrapperDouble;

        // Example methods from wrapper classes
        int parsedInt = Integer.parseInt("123"); // Parsing String to int
        double parsedDouble = Double.parseDouble("456.78"); // Parsing String to double

        // Converting wrapper objects back to String
        String intToString = wrapperInt.toString();
        String doubleToString = wrapperDouble.toString();

        // Printing values
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Integer to String: " + intToString);
    }
}
