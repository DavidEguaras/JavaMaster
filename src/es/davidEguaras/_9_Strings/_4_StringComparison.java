package es.davidEguaras._9_Strings;

public class _4_StringComparison {
    public static void main(String[] args) {
        String name1 = "David";
        String name2 = "David";
        String name3 = new String("David");


        System.out.println("---String Equality with == ---");
        System.out.println(name1 == name2);
        //true
        System.out.println(name1 == name3);
        //false

        System.out.println("---String Equality with .equals ---");
        System.out.println(name1.equals(name2));
        //true
        System.out.println(name1.equals(name3));
        //true

        //-Why does this happen?
        //  This happens because when comparing with == you are comparing if they "point" to the same object, that's why, when they aren't created with new String
        //  they will reference the same object in the String Pool and thus be equal.

        //  .equals() compares only the value, independently of the object, it just compares the values of both strings
    }
}
