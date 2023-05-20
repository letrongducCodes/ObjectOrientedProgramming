package hus.oop.lab11.BridgePattern.Exercise1;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Welcome to MacOS");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Loading " + url);
    }
}
