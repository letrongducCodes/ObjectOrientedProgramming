package hus.oop.lab11.CommandPattern.Pseudocode;

import javax.sql.RowSet;
import java.util.function.Function;

public class Application {
    String clipboard;
    Editor[] editors;
    Editor activeEditor;
    CommandHistory history;

    public Application() {
        clipboard = "";
        editors = new Editor[10];
        for (int i = 0; i < editors.length; i++) {
            editors[i] = new Editor();
        }
        activeEditor = editors[0];
        history = new CommandHistory();
    }

    // The code which assigns commands to UI objects may look like this.
    public void createUI() {
        // ...
        CopyCommand copyCommand = new CopyCommand(this,activeEditor);
        boolean copy = copyCommand.execute();
//        copyButton.setCommand(copy);
//        shortcuts.onKeyPress("Ctrl+C", copy);

        CutCommand cutCommand = new CutCommand(this,activeEditor);
        boolean cut = cutCommand.execute();
//        cutButton.setCommand(cut);
//        shortcuts.onKeyPress("Ctrl+X", cut);

        PasteCommand pasteCommand = new PasteCommand(this,activeEditor);
        boolean paste = pasteCommand.execute();
//        pasteButton.setCommand(paste);
//        shortcuts.onKeyPress("Ctrl+V", paste);

        UndoCommand undoCommand = new UndoCommand(this,activeEditor);
        boolean undo = undoCommand.execute();
//        undoButton.setCommand(undo);
//        shortcuts.onKeyPress("Ctrl+Z", undo);
    }

    // Execute a command and check whether it has to be added to the history.
    void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    // Take the most recent command from the history and run its undo method.
    // Note that we don't know the class of that command. But we don't have to,
    // since the command knows how to undo its own action.
    void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
