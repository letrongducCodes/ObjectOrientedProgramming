package hus.oop.lab11.FactoryMethodPattern.Pseudocode;

public class Application {
    private static Dialog dialog;
    public void initialize() {
        ApplicationConfig config = readApplicationConfigFile();

        if (config.getOS().equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (config.getOS().equals("Web")) {
            dialog = new WebDialog();
        } else {
            throw new RuntimeException("Error! Unknown operating system.");
        }
    }

    public void main() {
        this.initialize();
        dialog.render();
    }

    private ApplicationConfig readApplicationConfigFile() {
        // Dummy implementation to make the program compile.
        return new ApplicationConfig("Windows");
    }
}
