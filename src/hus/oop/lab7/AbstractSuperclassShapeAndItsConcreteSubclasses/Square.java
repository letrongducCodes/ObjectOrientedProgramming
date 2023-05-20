package hus.oop.lab7.AbstractSuperclassShapeAndItsConcreteSubclasses;

public class Square extends Rectangle {
    protected double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled, double width, double length) {
        super(width, length,color, filled);
        this.side = side;
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
