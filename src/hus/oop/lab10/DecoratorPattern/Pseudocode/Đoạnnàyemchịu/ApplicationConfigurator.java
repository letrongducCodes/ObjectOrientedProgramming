package hus.oop.lab10.DecoratorPattern.Pseudocode.Đoạnnàyemchịu;

import hus.oop.lab10.DecoratorPattern.Pseudocode.DataSource;
import hus.oop.lab10.DecoratorPattern.Pseudocode.FileDataSource;
import hus.oop.lab10.DecoratorPattern.Pseudocode.Đoạnnàyemchịu.SalaryManager;

public class ApplicationConfigurator {
    public void configurationExample() {
        DataSource source = new FileDataSource("salary.dat");
//        if (enabledEncryption) {
//            source = new EncryptionDecorator(source);
//        }
//        if (enabledCompression) {
//            source = new CompressionDecorator(source);
//        }

        SalaryManager logger = new SalaryManager(source);
        String salary = logger.load();
    }
}
