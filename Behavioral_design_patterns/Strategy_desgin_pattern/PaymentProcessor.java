package Behavioral_design_patterns.Strategy_desgin_pattern;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment(){
        paymentStrategy.processPayment();
    }

    public void setPaymentType(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
}
