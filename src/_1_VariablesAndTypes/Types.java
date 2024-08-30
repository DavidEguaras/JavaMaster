package _1_VariablesAndTypes;

import java.awt.*;

public class Types {
    public static void main(String[] args) {
        //Primitive Types
        //They are the most basic data types built into a programming language. They are not objects and hold simple, indivisible values.
        // Primitive type
        int a = 5;
        int b = a;  // b is now 5, a separate copy, it does NOT point to a, it creates a new copy of the value
        b = 10;  // Changing b doesn't affect a
        System.out.println(a);  // Outputs 5



        //Reference Type
        //They refer to objects or data structures that are more complex than primitive types.
        Point pointA = new Point(10, 10);
        System.out.println("pointA = " + pointA);

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;  // arr2 points to the same array as arr1
        arr2[0] = 10;  // Modifying arr2 affects arr1
        System.out.println(arr1[0]);  // Outputs 10
    }
}
