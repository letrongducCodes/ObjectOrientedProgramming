package hus.oop.lab11.VisitorPattern.Pseudocode;

public class Circle implements Shape {
    private Dot center;
    @Override
    public void move(int x, int y) {
        center.move(x,y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public boolean accept(Visitor v) {
        return v.visitCircle(this);
    }
}
