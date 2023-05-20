package hus.oop.lab11.VisitorPattern.Pseudocode;

public class Dot implements Shape {
    private int a;
    private int b;
    @Override
    public void move(int x, int y) {
        a += x;
        b += y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Dot");
    }

    @Override
    public boolean accept(Visitor v) {
        return v.visitDot(this);
    }
}
