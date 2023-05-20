package hus.oop.lab11.BridgePattern.Exercise1;

public abstract class Computer {
    private OperatingSystem os;

    public void startup() {
        os.startup();
    }

    public void browseInternet(String url) {
        os.loadUrl(url);
    }

    public abstract boolean canMoveComputer();
}
