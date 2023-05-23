package hus.oop.lab10.ObserverPattern.Exercise1;

public class ConcreteObserver3 implements MyObserver{
    @Override
    public void update(int newData) {
        System.out.println("Concrete observer 3 update!");
    }
}
