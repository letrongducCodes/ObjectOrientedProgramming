package hus.oop.lab5.MyCircle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0);
        System.out.println(circle1.toString());
        System.out.println( "The circle has radius of "
                + circle1.getRadius() + " and area of " + circle1.getArea());
        System.out.println(circle1);
        System.out.println("radius is: " + circle1.getRadius());
        System.out.printf("area is: %.2f%n" , circle1.getArea());
        System.out.printf("circumference is: %.2f%n" , circle1.getCircumference());
        Circle circle2 = new Circle(2.0);
        System.out.println( "The circle has radius of "
                + circle2.getRadius() + " and area of " + circle2.getArea());
    }
}
