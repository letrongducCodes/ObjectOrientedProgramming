package hus.oop.lab11.CommandPattern.Exercise1;

public class ShutDownCommand implements Command {

    public Command ShutDownCommand(Computer computer) {
        return new ShutDownCommand();
    }

    @Override
    public void execute() {

    }
}
