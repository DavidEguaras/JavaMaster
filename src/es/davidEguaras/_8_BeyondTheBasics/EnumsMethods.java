package es.davidEguaras._8_BeyondTheBasics;

import java.util.Arrays;

public class EnumsMethods {
    enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    public static void main(String[] args) {
        Gender male = Gender.MALE;
        System.out.println(Gender.valueOf("FEMALE"));
        System.out.println(Arrays.toString(Gender.values()));

        System.out.println("Looping though all the values:");
        for(Gender gender : Gender.values()){
            System.out.println(gender);
        }
    }
}
