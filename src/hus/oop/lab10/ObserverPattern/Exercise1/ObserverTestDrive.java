package hus.oop.lab10.ObserverPattern.Exercise1;

public class ObserverTestDrive {
    public static void main(String[] args) {
        Subject subject = new Subject();

        MyObserver myObserver1 = new ConcreteObserver1(subject);
        MyObserver myObserver2 = new ConcreteObserver2();
        MyObserver myObserver3 = new ConcreteObserver3();

        subject.registerObserver(myObserver1);
        subject.registerObserver(myObserver2);
        subject.registerObserver(myObserver3);

        System.out.println(subject);

        subject.changeData(1);
        System.out.println(subject);
        System.out.println();

        subject.changeData(2);
        System.out.println(subject);
    }
}
