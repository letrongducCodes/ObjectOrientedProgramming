package hus.oop.lab11.FactoryMethodPattern.Exercise3;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        Fruit apple = factory.provideFruit("Apple");
        System.out.println(apple);
        Fruit banana = factory.provideFruit("Banana");
        System.out.println(banana);
        Fruit orange = factory.provideFruit("Orange");
        System.out.println(orange);
    }
}
