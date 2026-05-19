package Behavioral_design_patterns.Strategy_desgin_pattern.Concrete_payment_methods;

import Behavioral_design_patterns.Strategy_desgin_pattern.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy{
    public void processPayment(){
        System.out.print("paypal payment processing..");
    }
}
