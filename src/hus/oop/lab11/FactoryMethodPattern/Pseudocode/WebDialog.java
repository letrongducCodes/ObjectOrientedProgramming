package hus.oop.lab11.FactoryMethodPattern.Pseudocode;

public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
