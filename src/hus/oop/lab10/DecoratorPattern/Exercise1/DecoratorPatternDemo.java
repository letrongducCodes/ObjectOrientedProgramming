package hus.oop.lab10.DecoratorPattern.Exercise1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle1 = new Circle(2);
        circle1.draw();

        ShapeDecorator circleDecorator1 = new RedShapeDecorator(circle1);
        circleDecorator1.draw();

        Shape circle2 = new Circle(4);
        circle2.draw();

        ShapeDecorator circleDecorator2 = new RedShapeDecorator(circle2);
        circleDecorator2.draw();

        Shape rectangle1 = new Rectangle(4,2);
        rectangle1.draw();

        ShapeDecorator rectangleDecorator1 = new RedShapeDecorator(rectangle1);
        rectangleDecorator1.draw();

        Shape rectangle2 = new Rectangle(6,1);
        rectangle2.draw();

        ShapeDecorator rectangleDecorator2 = new RedShapeDecorator(rectangle2);
        rectangleDecorator2.draw();
    }
}
