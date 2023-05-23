package hus.oop.lab10.StrategyPattern.Exercise1;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(MyPayStrategy myPayStrategy) {
        myPayStrategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return this.totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
