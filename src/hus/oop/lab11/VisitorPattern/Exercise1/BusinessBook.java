package hus.oop.lab11.VisitorPattern.Exercise1;

public class BusinessBook implements Book {

    @Override
    public void accept(Visitor v) {
        v.visit(this);

    }

    public String getPublisher() {
        return " ";
    }
}
