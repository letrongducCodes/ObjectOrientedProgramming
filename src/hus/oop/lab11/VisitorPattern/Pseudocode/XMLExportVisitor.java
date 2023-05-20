package hus.oop.lab11.VisitorPattern.Pseudocode;

public class XMLExportVisitor implements Visitor {
    @Override
    public boolean visitDot(Dot d) {
        return false;
    }

    @Override
    public boolean visitCircle(Circle c) {
        return false;
    }

    @Override
    public boolean visitRectangle(Rectangle r) {
        return false;
    }

    @Override
    public boolean visitCompoundShape(CompoundShape cs) {
        return false;
    }
}
