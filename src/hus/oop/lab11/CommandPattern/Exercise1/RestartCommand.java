package hus.oop.lab11.CommandPattern.Exercise1;

public class RestartCommand implements Command {

    public Command RestartCommand(Computer computer) {
        return new RestartCommand();
    }

    @Override
    public void execute() {

    }
}
