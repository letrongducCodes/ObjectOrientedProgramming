package hus.oop.lab11.CommandPattern.Exercise1;

public class RestartCommand implements Command {

    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.restart();
    }
}
