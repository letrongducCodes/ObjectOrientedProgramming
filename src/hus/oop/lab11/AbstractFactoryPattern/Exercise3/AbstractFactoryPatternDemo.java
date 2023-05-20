package hus.oop.lab11.AbstractFactoryPattern.Exercise3;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer shapeFactoryProducer = new FactoryProducer();
        ShapeFactory shapeFactory = (ShapeFactory) shapeFactoryProducer.getShapeFactory();
        Shape square = shapeFactory.getSquare();
        Shape rectangle = shapeFactory.getRectangle();
        square.draw();
        rectangle.draw();

        FactoryProducer roundedShapeFactoryProducer = new FactoryProducer();
        RoundedShapeFactory roundedShapeFactory = (RoundedShapeFactory) roundedShapeFactoryProducer.getRoundedFactory();
        Shape roundedSquare = roundedShapeFactory.getSquare();
        Shape roundedRectangle = roundedShapeFactory.getRectangle();
        roundedRectangle.draw();
        roundedSquare.draw();
    }
}
