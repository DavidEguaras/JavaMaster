package es.davidEguaras._3_ArraysVeryBasic;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //Arrays
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 6;

        System.out.println("numbers: " + Arrays.toString(numbers));


        int[] numbers2 = {0, 6, 99, 1, 8, 3};
        System.out.println("numbers2: " + Arrays.toString(numbers2));
        System.out.println("The numbers2 array length is = " + numbers2.length);
        numbers2 [1] = 44;
        System.out.println("change of numbers2[1]:" + Arrays.toString(numbers2));

        String[] names = {"Jamal", "David"};
    }
}
