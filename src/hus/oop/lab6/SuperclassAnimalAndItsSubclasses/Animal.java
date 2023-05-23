package hus.oop.lab6.SuperclassAnimalAndItsSubclasses;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[name = " + name + "]";
    }
}
