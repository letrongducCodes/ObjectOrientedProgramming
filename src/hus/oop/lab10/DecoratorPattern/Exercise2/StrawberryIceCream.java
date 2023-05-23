package hus.oop.lab10.DecoratorPattern.Exercise2;

public class StrawberryIceCream implements IceCream {
    private String description;
    private int price;

    public StrawberryIceCream() {
        this.price = 2;
        this.description = "StrawberryIceCream";
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
