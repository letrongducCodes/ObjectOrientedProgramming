package hus.oop.lab10.StrategyPattern.Exercise1;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
