package hus.oop.lab11.AbstractFactoryPattern.Pseudocode;

class ConfigurationReader {
    public Config readApplicationConfigFile(String OS) {
        return new Config(OS);
    }
}
