package es.davidEguaras._8_BeyondTheBasics;

import java.util.Arrays;

public class mainMethod {
    // public so it can be accessed by other classes, but in this case, especially the JVM
    // static so it doesn't need instances of the class to be created
    // void for it to not return any value
    // main, which is the name of the method the JVM will search to execute
    // String[] args, passes a String array with the arguments needed in the program
    public static void main(String[] args) {
        System.out.println("Program was given the following arguments: ");
        if(args.length > 0){
            System.out.println("The following arguments: ");
            System.out.println(Arrays.toString(args));
        }else{
            System.out.println("0 arguments");
        }
    }
}
