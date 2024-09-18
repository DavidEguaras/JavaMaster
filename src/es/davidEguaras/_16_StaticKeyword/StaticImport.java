package es.davidEguaras._16_StaticKeyword;


/*
This is a static import
With static import, you can access static members (fields and methods)
of a class directly without qualifying them with the class name. This reduces redundancy when using static members frequently.
*/
import static java.lang.Math.*;

class StaticImport {
    public static void main(String[] args) {
        double value = 64;

        // You can call static methods like sqrt and PI directly
        double result = sqrt(value);  // Instead of Math.sqrt(value)
        double circleArea = PI * 5 * 5;  // Instead of Math.PI

        System.out.println("Square Root: " + result);
        System.out.println("Circle Area: " + circleArea);
    }
}
