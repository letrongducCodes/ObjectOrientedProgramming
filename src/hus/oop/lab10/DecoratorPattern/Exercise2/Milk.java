package hus.oop.lab10.DecoratorPattern.Exercise2;

public class Milk extends IceCreamDecorator {
    private int price;
    private String description;

    public Milk(IceCream swappee) {
        super(swappee);
        this.price = 1;
        this.description = "Milk";
    }

    @Override
    public String getDescription() {
        return this.swappee.getDescription() + this.description;
    }

    @Override
    public int cost() {
        return this.swappee.cost() + this.price;
    }
}
