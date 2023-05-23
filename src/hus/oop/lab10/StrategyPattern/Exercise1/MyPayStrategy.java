package hus.oop.lab10.StrategyPattern.Exercise1;

public class MyPayStrategy {
    private static MyPayStrategy uniqueInstance;
    private PayStrategy payStrategy;

    private MyPayStrategy() {

    }

    public static MyPayStrategy getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MyPayStrategy();
        }
        return uniqueInstance;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public boolean pay(int paymentAmount) {
        return payStrategy.pay(paymentAmount);
    }

    public void collectPaymentDetails() {
        payStrategy.collectPaymentDetails();
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }
}
