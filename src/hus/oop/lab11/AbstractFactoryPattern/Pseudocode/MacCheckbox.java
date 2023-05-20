package hus.oop.lab11.AbstractFactoryPattern.Pseudocode;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in macOS style");
    }
}
