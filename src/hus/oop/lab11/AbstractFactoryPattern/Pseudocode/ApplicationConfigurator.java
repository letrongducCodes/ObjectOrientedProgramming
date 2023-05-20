package hus.oop.lab11.AbstractFactoryPattern.Pseudocode;

import hus.oop.lab11.FactoryMethodPattern.Pseudocode.ApplicationConfig;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        try {
            ApplicationConfig config = readApplicationConfigFile();
            GUIFactory factory;
            if (config.OS.equals("Windows")) {
                factory = new WinFactory();
            } else if (config.OS.equals("Mac")) {
                factory = new MacFactory();
            } else {
                throw new Exception("Error! Unknown operating system.");
            }
            Application app = new Application(factory);
            app.createUI();
            app.paint();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ApplicationConfig readApplicationConfigFile() throws Exception {
        // Code để đọc tệp cấu hình ứng dụng
        // và trả về đối tượng ApplicationConfig.
        String filePath = "path/to/config/file"; // thay đổi đường dẫn tới tệp cấu hình ứng dụng của bạn
        File configFile = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(configFile));

        String os = null;
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("OS=")) {
                os = line.substring(3).trim();
                break;
            }
        }

        reader.close();

        if (os == null) {
            throw new Exception("Error! OS not found in config file.");
        }

        return new ApplicationConfig(os);
    }
}
