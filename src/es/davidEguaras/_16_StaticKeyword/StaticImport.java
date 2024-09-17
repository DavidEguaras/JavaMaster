package es.davidEguaras._16_StaticKeyword;

//This is a static import
import static java.lang.Math.*;

class StaticImportExample {
    public static void main(String[] args) {
        double value = 64;

        // You can call static methods like sqrt and PI directly
        double result = sqrt(value);  // Instead of Math.sqrt(value)
        double circleArea = PI * 5 * 5;  // Instead of Math.PI

        System.out.println("Square Root: " + result);
        System.out.println("Circle Area: " + circleArea);
    }
}
