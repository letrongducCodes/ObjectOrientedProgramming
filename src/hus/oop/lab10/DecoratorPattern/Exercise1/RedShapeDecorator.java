package hus.oop.lab10.DecoratorPattern.Exercise1;

public class RedShapeDecorator extends ShapeDecorator {
    private Shape shape;
    private String border;

    public RedShapeDecorator(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    @Override
    public void draw() {
        this.shape.draw();
        this.setRedBorder();
    }

    public void setRedBorder() {
        this.border = "Red border";
        System.out.print(" with " + border);
        System.out.println();
    }
}
