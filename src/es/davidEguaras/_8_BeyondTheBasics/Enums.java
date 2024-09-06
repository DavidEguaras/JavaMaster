package es.davidEguaras._8_BeyondTheBasics;

//enums also allows us to create constants
public class Enums {

    //the reason of having enums it's because now we have dataTypes to work with, not like when we use the final keyword where we would have a String, int, char...
    //we have all the options encapsulated within
    enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    public static void main(String[] args) {
        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);
    }
}
