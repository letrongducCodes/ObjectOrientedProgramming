package hus.oop.lab11.BridgePattern.Exercise3;

public class ConsoleLogger implements MessageLogger {
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
