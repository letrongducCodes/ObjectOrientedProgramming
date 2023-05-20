package hus.oop.lab11.VisitorPattern.Pseudocode;

public interface Shape {
    void move(int x, int y);

    void draw();
    boolean accept(Visitor v);
}
