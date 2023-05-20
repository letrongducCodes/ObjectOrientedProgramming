package hus.oop.lab11.CommandPattern.Pseudocode.EmChịu;

public class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.clipboard = editor.getSelection();
        return false;
    }
}
