package hus.oop.lab6.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return 2.0 * Math.PI * super.getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height = " + height + "]";
    }
}
