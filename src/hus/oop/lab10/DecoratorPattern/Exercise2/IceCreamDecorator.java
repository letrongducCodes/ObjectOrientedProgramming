package hus.oop.lab10.DecoratorPattern.Exercise2;

public abstract class IceCreamDecorator implements IceCream {
    protected IceCream swappee;

    public IceCreamDecorator(IceCream swappee) {
        this.swappee = swappee;
    }
}
