package hus.oop.lab10.DecoratorPattern.Exercise1;

public abstract class ShapeDecorator implements Shape {
    public Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {

    }
}
