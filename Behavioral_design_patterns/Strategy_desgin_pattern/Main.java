package Behavioral_design_patterns.Strategy_desgin_pattern;

import Behavioral_design_patterns.Strategy_desgin_pattern.Concrete_payment_methods.*;

public class Main {
        public static void main(String[] args){
        PaymentStrategy paypal = new PayPalPayment();
        PaymentStrategy crypto = new CryptoPayment();
        PaymentStrategy creditcard = new CreditCardPayment();

        PaymentProcessor paymentProcessor = new PaymentProcessor(creditcard);

        paymentProcessor.processPayment();

        paymentProcessor.setPaymentType(paypal);

        paymentProcessor.processPayment();

        paymentProcessor.setPaymentType(crypto);

        paymentProcessor.processPayment();
}
}