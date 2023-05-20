package hus.oop.lab11.AbstractFactoryPattern.Pseudocode;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in Windows style");
    }
}
