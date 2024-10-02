package es.davidEguaras._20_Abstraction.AbstractPaymentSystem;

public class PaymentSystemMain {

    public static void main(String[] args) {
        PaymentProcessor creditCardPayment = new CreditCardProcessor();
        PaymentProcessor paypalPayment = new PayPalProcessor();
        PaymentProcessor bankTransferPayment = new BankTransferProcessor();

        System.out.println("Processing Credit Card Payment:");
        creditCardPayment.process();

        System.out.println("\nProcessing PayPal Payment:");
        paypalPayment.process();

        System.out.println("\nProcessing Bank Transfer Payment:");
        bankTransferPayment.process();
    }
}
