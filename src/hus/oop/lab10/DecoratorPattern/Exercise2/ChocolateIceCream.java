package hus.oop.lab10.DecoratorPattern.Exercise2;

public class ChocolateIceCream implements IceCream {
    private String description;
    private int price;

    public ChocolateIceCream() {
        this.price = 3;
        this.description = "ChocolateIceCream";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int cost() {
        return this.price;
    }
}
