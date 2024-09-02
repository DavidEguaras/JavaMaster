package es.davidEguaras._8_BeyondTheBasics;




public class VariableScope {
    //A global variable is a variable which is accessed by anything within this (or any other) class or from the outside
    private static final String NAME = "DAVID";

    public static void main(String[] args) {
        String country = "England";
        System.out.println(NAME);
        foo();
    }

    private static void foo(){
        //❌Error: Variable out of scope -> System.out.println(country);
        System.out.println(NAME);
    }
}
