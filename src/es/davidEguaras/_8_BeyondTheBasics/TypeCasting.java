package es.davidEguaras._8_BeyondTheBasics;

public class TypeCasting {
    // Type Casting - Convert one data type to another
    //two types:
    //  -Implicit Type (Widening) Casting
    //  -Explicit Type (Narrowing) Casting

    public static void main(String[] args) {
        // Implicit Type (Widening) Casting
        //smaller to bigger dataTypes
        int balance = 100;
        double balanceInDouble = balance;
        System.out.println(balanceInDouble);
        System.out.println(balance);

        //Explicit Type (Narrowing) Casting
        //bigger to smaller dataTypes
        double remainingBalance = 100.55;
        //❌ERROR: int remainingBalanceInt = remainingBalance;
        int remainingBalanceInt = (int)remainingBalance;
        System.out.println(remainingBalance);
        System.out.println(remainingBalanceInt);
        //we lost data (.55)
    }
}
