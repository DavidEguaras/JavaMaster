package es.davidEguaras._18_ObjectEncapsulation;

//Encapsulation is not the process of hiding data, hiding data is a feature of encapsulation but not the principal purpose


import java.math.BigDecimal;
import static java.math.BigDecimal.ZERO;

public class BankAccount {
    private String name;
    private BigDecimal balance;
    boolean hasOverdraft;

    public BankAccount(String name) {
        this.name = name;
        this.balance = ZERO;
        this.hasOverdraft = false;
    }

    public BankAccount(String name, BigDecimal balance, boolean hasOverdraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public BigDecimal withdraw(BigDecimal amount){
        if(balance.subtract(amount).compareTo(ZERO) >= 0){
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return ZERO;
    }
}
