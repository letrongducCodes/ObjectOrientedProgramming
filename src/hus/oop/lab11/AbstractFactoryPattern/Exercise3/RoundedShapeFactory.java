package hus.oop.lab11.AbstractFactoryPattern.Exercise3;

public class RoundedShapeFactory implements AbstractFactory {
    @Override
    public Shape getRectangle() {
        return new RoundedRectangle();
    }

    @Override
    public Shape getSquare() {
        return new RoundedSquare();
    }
}
