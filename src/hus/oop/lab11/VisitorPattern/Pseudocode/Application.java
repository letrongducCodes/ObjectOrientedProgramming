package hus.oop.lab11.VisitorPattern.Pseudocode;

public class Application {
    private static Shape[] allShapes;

    public static void export() {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        for (Shape shape: allShapes) {
            shape.accept(exportVisitor);
        }
    }

    public static void main(String[] args) {
//        export();
    }
}
