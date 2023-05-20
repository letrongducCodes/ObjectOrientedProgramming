package hus.oop.lab11.AbstractFactoryPattern.Pseudocode;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a button in macOS style");
    }
}
