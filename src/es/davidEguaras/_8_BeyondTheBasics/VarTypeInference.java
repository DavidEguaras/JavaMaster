package es.davidEguaras._8_BeyondTheBasics;

public class VarTypeInference {

    //❌ERROR❌
    //var wrong = "wrong";
    //var can only be used for local variables

    public static void main(String[] args) {
        /*
        String name = "Jamila";
        String[] names = {"Jamila", "Alex"};
        int age = 23;
        boolean isAdult = false;
        double balance = 1_000_000.33;
        */

        //var can only be used for local variables
        var name = "Jamila";
        var names = new String[]{"Jamila", "Alex"};
        var age = 23;
        var isAdult = false;
        var balance = 1_000_000.33;
    }


}
