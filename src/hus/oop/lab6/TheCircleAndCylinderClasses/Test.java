package hus.oop.lab6.TheCircleAndCylinderClasses;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Circle c1 =new Circle(1.0,p1);
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Center: (" + c1.getCenter().getX()
                + ", " + c1.getCenter().getY() + ")");
        System.out.println("Area: " + c1.getArea());
    }
}
