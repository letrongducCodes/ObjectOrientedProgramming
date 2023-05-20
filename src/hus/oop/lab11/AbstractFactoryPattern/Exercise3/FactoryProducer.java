package hus.oop.lab11.AbstractFactoryPattern.Exercise3;

public class FactoryProducer {
    public AbstractFactory getRoundedFactory() {
        return new RoundedShapeFactory();
    }
    public AbstractFactory getShapeFactory() {
        return new ShapeFactory();
    }
}
