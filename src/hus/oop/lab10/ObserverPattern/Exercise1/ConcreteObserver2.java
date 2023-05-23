package hus.oop.lab10.ObserverPattern.Exercise1;

public class ConcreteObserver2 implements MyObserver{
    @Override
    public void update(int newData) {
        System.out.println("Concrete observer 2 update!");
    }
}
