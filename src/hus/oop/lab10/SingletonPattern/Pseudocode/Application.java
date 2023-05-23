package hus.oop.lab10.SingletonPattern.Pseudocode;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT ...");
        Database bar = Database.getInstance();
        bar.query("SELECT ...");
    }
}
