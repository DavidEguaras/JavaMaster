package es.davidEguaras._20_Abstraction.AbstractPaymentSystem;

class PayPalProcessor extends PaymentProcessor {

    @Override
    protected void authorize() {
        System.out.println("Authorizing PayPal Account...");
        // Specific PayPal authorization logic
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing PayPal Payment...");
        // Specific logic to process a PayPal payment
    }

    @Override
    protected void confirmPayment() {
        System.out.println("Confirming PayPal Payment...");
        // Specific logic to confirm the PayPal payment
    }
}

