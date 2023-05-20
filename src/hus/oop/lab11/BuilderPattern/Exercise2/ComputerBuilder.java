package hus.oop.lab11.BuilderPattern.Exercise2;

public class ComputerBuilder {
    private Computer computer;

    public ComputerBuilder() {
        this.reset();
    }

    public ComputerBuilder reset() {
        this.computer = new Computer();
        return this;
    }

    public ComputerBuilder withCase(String computerCase) {
        this.computer.setComputerCase(computerCase);
        return this;
    }

    public ComputerBuilder withCPU(String CPU) {
        this.computer.setCPU(CPU);
        return this;
    }

    public ComputerBuilder withMotherboard(String motherboard) {
        this.computer.setMotherboard(motherboard);
        return this;
    }

    public ComputerBuilder withGPU(String GPU) {
        this.computer.setGPU(GPU);
        return this;
    }

    public ComputerBuilder withHDD(String HDD) {
        this.computer.setHDD(HDD);
        return this;
    }

    public ComputerBuilder withOperatingSystem(String operatingSystem) {
        this.computer.setOperatingSystem(operatingSystem);
        return this;
    }

    public ComputerBuilder withPowerSupply(int powerSupply) {
        this.computer.setPowerSupply(powerSupply);
        return this;
    }

    public ComputerBuilder withAmountOfRam(int amountOfRAM) {
        this.computer.setAmountOfRAM(amountOfRAM);
        return this;
    }

    public Computer build() {
        Computer build = this.computer;
        this.reset();
        return build;
    }
}
