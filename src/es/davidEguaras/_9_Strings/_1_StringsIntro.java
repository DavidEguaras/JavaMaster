package es.davidEguaras._9_Strings;

public class _1_StringsIntro {
    public static void main(String[] args) {
        String name = "David";
        //String Methods (the ones that are most used)
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("  ".isBlank());
        System.out.println("  ".isEmpty());
        System.out.println(" Hello   ".trim());
        System.out.println(name.startsWith("D"));
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 4));
        System.out.println(name.replace("D", "L"));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
    }
}
