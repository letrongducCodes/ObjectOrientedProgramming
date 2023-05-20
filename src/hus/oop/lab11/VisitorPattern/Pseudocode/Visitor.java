package hus.oop.lab11.VisitorPattern.Pseudocode;

public interface Visitor {
    boolean visitDot(Dot d);
    boolean visitCircle(Circle c);
    boolean visitRectangle(Rectangle r);
    boolean visitCompoundShape(CompoundShape cs);
}
