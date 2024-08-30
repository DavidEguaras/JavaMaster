package _1_VariablesAndTypes;

import java.awt.*;

public class PassByValueReference {
    public static void main(String[] args) {
        //Pass by value in REFERENCE TYPES/OBJECTS

        // For objects (reference types), the value of the reference (or memory address) is copied, but the object itself is not.
        // Therefore, while the reference can point to the same object, reassigning the reference inside the function
        // won't change the original reference outside the function.
        Point pointA = new Point(10, 10);
        Point pointB = pointA;

        pointA.x = 100;
        pointB.y = 90;

        //For both points the value is: x:100, y:90, why? because we are changing the REFERENCE OBJECT because they are POINTING to the SAME OBJECT in the HEAP
        System.out.println(pointA);
        System.out.println(pointB);

        pointB = new Point(100, 90);
        pointB.y = 55;

        //Now that we have created ANOTHER OBJECT for the value reference (new Point),
        //because we have created another object in the HEAP, which the variable pointB is now pointing to
        System.out.println(pointA);
        System.out.println(pointB);
    }
}
