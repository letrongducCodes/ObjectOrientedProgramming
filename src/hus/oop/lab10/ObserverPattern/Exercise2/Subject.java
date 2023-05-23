package hus.oop.lab10.ObserverPattern.Exercise2;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new LinkedList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
