package hus.oop.lab7.AbstractSuperclassAnimalAndItsImplementationSubclasses;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.print("Woof");
    }

    public void greets(Dog another) {
        System.out.print("Woooof");
    }
}
