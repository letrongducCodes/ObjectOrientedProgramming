package hus.oop.lab11.FactoryMethodPattern.Exercise3;

public class Apple implements Fruit {
    @Override
    public void produceJuice() {
        System.out.println("Produce Apple Juice");
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
