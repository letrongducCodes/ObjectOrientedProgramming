package hus.oop.lab11.FactoryMethodPattern.Exercise3;

public class Banana implements Fruit {
    @Override
    public void produceJuice() {
        System.out.println("Produce Banana Juice");
    }

    @Override
    public String toString() {
        return "Banana";
    }
}
