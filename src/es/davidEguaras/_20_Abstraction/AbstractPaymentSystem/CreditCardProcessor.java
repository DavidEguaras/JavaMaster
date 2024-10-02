package es.davidEguaras._20_Abstraction.AbstractPaymentSystem;

class CreditCardProcessor extends PaymentProcessor {

    @Override
    protected void authorize() {
        System.out.println("Authorizing Credit Card...");
        // Specific credit card authorization logic
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing Credit Card Payment...");
        // Specific logic to process a credit card payment
    }

    @Override
    protected void confirmPayment() {
        System.out.println("Confirming Credit Card Payment...");
        // Specific logic to confirm the credit card payment
    }
}
