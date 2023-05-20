package hus.oop.lab7.AbstractSuperclassAnimalAndItsImplementationSubclasses;

public class BigDog extends  Dog {
    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.print("Wooow");
    }

    public void greets(Dog another) {
        System.out.print("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.print("Wooooooooow");
    }
}
