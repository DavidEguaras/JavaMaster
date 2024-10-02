package es.davidEguaras._18_ObjectEncapsulation;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
                "Eguaras",
                BigDecimal.TEN,
                false);

        System.out.println(account.withdraw(new BigDecimal("9.0")));
        System.out.println(account.getBalance());
        //with set, we can control how the data is stored from the method
        account.setBalance(new BigDecimal("10000"));
        System.out.println(account.getBalance());
    }
}
