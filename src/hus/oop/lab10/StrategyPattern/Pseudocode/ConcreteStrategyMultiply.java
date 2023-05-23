package hus.oop.lab10.StrategyPattern.Pseudocode;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
