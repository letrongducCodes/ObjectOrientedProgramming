package hus.oop.lab11.VisitorPattern.Exercise1;

public class DesignPatternBook extends ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getResource() {
        return " ";
    }

    public String getBestSeller() {
        return " ";
    }
}
