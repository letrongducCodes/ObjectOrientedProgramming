package hus.oop.lab11.VisitorPattern.Pseudocode;

public class Rectangle implements Shape {
    private Dot center;
    @Override
    public void move(int x, int y) {
        center.move(x,y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public boolean accept(Visitor v) {
        return v.visitRectangle(this);
    }
}
