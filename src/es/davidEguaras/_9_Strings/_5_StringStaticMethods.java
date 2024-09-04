package es.davidEguaras._9_Strings;

public class _5_StringStaticMethods {
    public static void main(String[] args) {
        //they are static because we call them using String., so we are calling the class itself, not an object, we are a calling "the blueprint"
        String number = String.valueOf(1);
        System.out.println(number);

        String format = String.format("Number %s", number);
        System.out.println(format);

        String[] names = {"David", "Hugo", "Ana", "James", "Jamal"};
        String joined = String.join(",", names);
        System.out.println(names);
    }
}
