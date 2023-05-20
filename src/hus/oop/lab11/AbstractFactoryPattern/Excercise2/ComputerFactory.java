package hus.oop.lab11.AbstractFactoryPattern.Excercise2;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
