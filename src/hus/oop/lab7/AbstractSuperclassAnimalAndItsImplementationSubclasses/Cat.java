package hus.oop.lab7.AbstractSuperclassAnimalAndItsImplementationSubclasses;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.print("Meow");
    }
}
