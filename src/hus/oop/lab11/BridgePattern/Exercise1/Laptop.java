package hus.oop.lab11.BridgePattern.Exercise1;

public class Laptop extends Computer {
    @Override
    public void startup() {
        super.startup();
    }

    @Override
    public void browseInternet(String url) {
        super.browseInternet(url);
    }

    @Override
    public boolean canMoveComputer() {
        return true;
    }
}