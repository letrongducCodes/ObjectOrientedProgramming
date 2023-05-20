package hus.oop.lab11.FactoryMethodPattern.Exercise3;

public class FruitFactory {
    Fruit provideFruit(String type) {
        if(type.equals("Apple")) {
            return new Apple();
        }
        if(type.equals("Banana")) {
            return new Banana();
        }
        if(type.equals("Orange")) {
            return new Orange();
        }
        return null;
    }
}
