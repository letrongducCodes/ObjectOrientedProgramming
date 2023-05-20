package hus.oop.lab11.FactoryMethodPattern.Pseudocode;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows button...");
    }

    @Override
    public void onClick() {
        System.out.println("Binding Windows button click event...");
    }
}
