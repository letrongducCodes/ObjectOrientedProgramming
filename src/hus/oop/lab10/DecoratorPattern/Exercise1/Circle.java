package hus.oop.lab10.DecoratorPattern.Exercise1;

public class Circle implements Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.print("Drawing circle with radius = " + this.radius);
    }
}
