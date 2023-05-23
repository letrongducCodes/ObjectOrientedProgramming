package hus.oop.lab10.DecoratorPattern.Exercise2;

public class VanillaIceCream implements IceCream {

    private String description;
    private int price;

    public VanillaIceCream() {
        this.price = 1;
        this.description = "VanillaIceCream";
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
