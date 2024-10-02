package es.davidEguaras._20_Abstraction.AbstractPaymentSystem;


abstract class PaymentProcessor {

    // Template method - Defines the flow of payment processing
    public void process() {
        authorize();
        processPayment();
        confirmPayment();
        System.out.println("Payment processed successfully!");
    }

    // Abstract method - Must be implemented by subclasses
    protected abstract void authorize();

    // Abstract method - Must be implemented by subclasses
    protected abstract void processPayment();

    // Abstract method - Must be implemented by subclasses
    protected abstract void confirmPayment();
}


