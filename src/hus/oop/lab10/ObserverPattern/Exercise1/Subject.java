package hus.oop.lab10.ObserverPattern.Exercise1;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private int mainState;
    private List<MyObserver> observers;

    public Subject() {
        this.mainState = 0;
        this.observers = new LinkedList<>();
    }

    public void registerObserver(MyObserver myObserver) {
        this.observers.add(myObserver);
    }

    public void remove(MyObserver myObserver) {
        this.observers.remove(myObserver);
    }

    public void changeData(int newData) {
        if(this.mainState == newData) {
            return;
        }
        this.mainState = newData;
        dataChanged();
    }

    private void dataChanged() {
        notifyObservers();
    }

    public void notifyObservers() {
        for(MyObserver myObserver : this.observers) {
            myObserver.update(this.mainState);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.mainState);
    }
}
