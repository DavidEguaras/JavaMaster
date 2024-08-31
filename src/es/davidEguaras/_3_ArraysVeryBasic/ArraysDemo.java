package es.davidEguaras._3_ArraysVeryBasic;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //Arrays
        //For primitives the default value is 0
        int[] numbers = new int[3];
        numbers[0] = 2;
        System.out.println(Arrays.toString(numbers));
        Arrays.fill(numbers, -1);
        System.out.println(Arrays.toString(numbers));

        //For referenceTypes the default value is null
        String[] names = new String[3];
        names[1] = "David";
        System.out.println(Arrays.toString(names));

        Arrays.fill(names, "James");
        System.out.println(Arrays.toString(names));
    }
}
