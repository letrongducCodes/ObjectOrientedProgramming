package hus.oop.lab6.TheCircleAndCylinderClasses;

import java.awt.*;

public class Circle {
    private double radius;
    private Point center;

    public Circle() {
    }

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
