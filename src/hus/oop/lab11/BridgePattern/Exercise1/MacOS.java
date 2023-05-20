package hus.oop.lab11.BridgePattern.Exercise1;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Starting up Mac");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Opening Safari");
        System.out.println("Loading " + url + " in Safari");
    }
}
