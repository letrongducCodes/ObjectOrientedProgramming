package hus.oop.lab11.BridgePattern.Exercise1;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Welcome to WindowsOS");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Loading " + url);
    }
}
