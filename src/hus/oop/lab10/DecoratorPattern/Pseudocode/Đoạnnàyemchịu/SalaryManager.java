package hus.oop.lab10.DecoratorPattern.Pseudocode.Đoạnnàyemchịu;

import hus.oop.lab10.DecoratorPattern.Pseudocode.DataSource;

public class SalaryManager {
    private final DataSource source;

    public SalaryManager(DataSource source) {
        this.source = source;
    }

    public String load() {
        return source.readData();
    }

    public void save() {
        source.writeData("salaryRecords");
    }
}
