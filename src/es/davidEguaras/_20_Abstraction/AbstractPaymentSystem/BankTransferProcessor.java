package es.davidEguaras._20_Abstraction.AbstractPaymentSystem;

class BankTransferProcessor extends PaymentProcessor {

    @Override
    protected void authorize() {
        System.out.println("Authorizing Bank Transfer...");
        // Specific bank transfer authorization logic
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing Bank Transfer...");
        // Specific logic to process a bank transfer
    }

    @Override
    protected void confirmPayment() {
        System.out.println("Confirming Bank Transfer...");
        // Specific logic to confirm the bank transfer
    }
}
