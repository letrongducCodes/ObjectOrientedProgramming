package hus.oop.lab11.FactoryMethodPattern.Pseudocode;

public class ApplicationConfig {
    public static String OS;

    public ApplicationConfig(String os) {
        this.OS = os;
    }

    public String getOS() {
        return OS;
    }
}