package exercises._2_loopsAndArrays;

// declare and initialize a String array which holds the values "a", "b", "c" and "d"
// print the array to the console
// then,  create a second array which is initialized using your original array
// change the value at index 0 of the new array to "z"
// then, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
// NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied
// and second being the length of the new array change the value at index 0 of the new array to "z"
// print both of the arrays and compare
import java.util.Arrays;

public class ArraysAndReferenceValues {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "d"};
        System.out.println("Original Array 1: " + Arrays.toString(array1));

        String[] array2 = array1;
        array2[0] = "z";

        String[] array3 = Arrays.copyOf(array1, array1.length);
        array3[0] = "c";

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));
    }
}
