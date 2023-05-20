package hus.oop.lab11.FactoryMethodPattern.Pseudocode;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
