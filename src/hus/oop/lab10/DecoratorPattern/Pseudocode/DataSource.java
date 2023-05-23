package hus.oop.lab10.DecoratorPattern.Pseudocode;

public interface DataSource<data> {
    void writeData(String data);
    String readData();
}
