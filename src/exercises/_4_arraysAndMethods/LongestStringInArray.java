package exercises._4_arraysAndMethods;
import java.util.ArrayList;
import java.util.List;

/*
    Write a method that finds the longest string in any given array.
    i.e. [] -> ""
    i.e. ["hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
*/

public class LongestStringInArray{

    public static void findLongestStringInArray(String[] array) {
        int maxLength = 0;

        //I used arrayList even tough I have not reached them yet, but it's just more efficient and fun
        List<String> printedStrings = new ArrayList<>();

        for (String string : array) {
            //We check if the current string length is bigger than the current maxLength, and then we check if the current string hasn't already been printed before
            if ((string.length() >= maxLength) && (!printedStrings.contains(string))) {
                maxLength = string.length();
                printedStrings.add(string);
                System.out.println(string);
            }
        }
    }

    public static void main(String[] args) {
        String[] array1 = {};
        String[] array2 = {"hello", "ola", "bye", "ciao"};
        String[] array3 = {"hello", "hello", "ola", "bingo", "ciao", "hello"};
        String[] array4 = {"hello", "bingo", "ola", "bye", "ciao"};

        System.out.println("Longest in array1: ");
        findLongestStringInArray(array1);
        System.out.println("Longest in array2: ");
        findLongestStringInArray(array2);
        System.out.println("Longest in array3: ");
        findLongestStringInArray(array3);
        System.out.println("Longest in array4: ");
        findLongestStringInArray(array4);
    }

}

