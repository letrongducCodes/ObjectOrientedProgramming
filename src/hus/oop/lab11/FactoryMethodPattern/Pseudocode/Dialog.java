package hus.oop.lab11.FactoryMethodPattern.Pseudocode;

public abstract class Dialog {
    abstract Button createButton();
    void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}
