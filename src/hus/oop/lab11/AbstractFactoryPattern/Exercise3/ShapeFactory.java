package hus.oop.lab11.AbstractFactoryPattern.Exercise3;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getRectangle() {
        return new Rectangle();
    }

    @Override
    public Shape getSquare() {
        return new Square();
    }
}
