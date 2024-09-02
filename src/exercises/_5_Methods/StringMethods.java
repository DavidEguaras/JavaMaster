package exercises._5_Methods;
//-1
// Write a method which takes a string as an argument, capitalizes the first letter and returns the capitalized string.

//-2
// Write a method which takes an array of strings as an argument and returns the number of items in the array.
public class StringMethods {

    public static String firstLetterCapitalizer (String string){
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    public static int numberOfStringsInArray(String[] array){
        return array.length;
    }

    public static void main(String[] args) {
        String name = "david";
        String[] names = {"David", "Ana", "Hugo"};

        System.out.println(firstLetterCapitalizer(name));
        System.out.println("The number of names in the array: " + numberOfStringsInArray(names));
    }
}
