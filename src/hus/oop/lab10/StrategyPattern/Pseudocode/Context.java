package hus.oop.lab10.StrategyPattern.Pseudocode;

public class Context {
    private Strategy strategy;

    public Context() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int a, int b) {
        return strategy.execute(a,b);
    }
}
