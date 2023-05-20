package hus.oop.lab7.GeometricObjectInterfaceAndItsImplementationClassesCircleAndRectangle;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[" + "width=" + width + ", length=" + length + "]";
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2.0 * ( length + width);
    }
}
