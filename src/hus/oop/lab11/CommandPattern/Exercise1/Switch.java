package hus.oop.lab11.CommandPattern.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Switch {
    private List<Command> history = new ArrayList<Command>();

    public Switch() {
    }

    public void storeAndExecute(Command command) {
        this.history.add(command); // optional, can do the execute only!
        command.execute();
    }
}
