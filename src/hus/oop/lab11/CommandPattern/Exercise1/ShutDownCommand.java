package hus.oop.lab11.CommandPattern.Exercise1;

public class ShutDownCommand implements Command {

    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute(){
        computer.shutDown();
    }
}
