package es.davidEguaras._9_Strings;

public class _3_LiteralVsObject {
    public static void main(String[] args) {
        String name1 = "David";
        String name2 = "David";
        name2 = "Alex";
        //This gives us a Brand new String,creating a new String object within the heap but outside of the String Pool, since it's a "new String"
        // it can't use a reference to pre-existent String object within the String Pool, and creates another String object outside the Pool in the heap
        String name3 = new String("David");
    }
}
