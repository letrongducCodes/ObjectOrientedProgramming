package hus.oop.lab11.FactoryMethodPattern.Exercise3;

public class Orange implements Fruit {
    @Override
    public void produceJuice() {
        System.out.println("Produce Orange Juice");
    }
    @Override
    public String toString() {
        return "Orange";
    }
}
