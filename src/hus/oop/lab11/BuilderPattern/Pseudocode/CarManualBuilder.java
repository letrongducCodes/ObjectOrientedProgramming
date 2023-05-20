package hus.oop.lab11.BuilderPattern.Pseudocode;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        this.manual = new Manual();
        return this;
    }

    @Override
    public Builder setSeats(int numSeats) {
        this.manual.setNumSeats(numSeats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.manual.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripComputer) {
        this.manual.setHasTripComputer(hasTripComputer);
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        this.manual.setHasGPS(hasGPS);
        return this;
    }

    public Manual getResult() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
