package hus.oop.lab11.BridgePattern.Exercise1;

public class Client {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        laptop.startup();
        laptop.browseInternet("Facebook.com");
    }
}
