package hus.oop.lab10.DecoratorPattern.Exercise1;

public class Rectangle implements Shape {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.print("Drawing rectangle with length = " + this.length
        + ", width = " + this.width);
    }
}
