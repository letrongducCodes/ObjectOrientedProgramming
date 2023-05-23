package hus.oop.lab10.DecoratorPattern.Exercise2;

public class NutsTopping extends IceCreamDecorator {
    private int price;
    private String description;

    public NutsTopping(IceCream swappee) {
        super(swappee);
        this.price = 2;
        this.description = "Nuts";
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
