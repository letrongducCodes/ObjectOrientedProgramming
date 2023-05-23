package hus.oop.lab10.DecoratorPattern.Exercise2;

public class HoneyTopping extends IceCreamDecorator {
    private int price;
    private String description;

    public HoneyTopping(IceCream swappee) {
        super(swappee);
        this.price = 1;
        this.description = "Honey";
    }

    @Override
    public String getDescription() {
        return this.swappee.getDescription() + " " + this.description;
    }

    @Override
    public int cost() {
        return this.swappee.cost() + this.price;
    }
}
