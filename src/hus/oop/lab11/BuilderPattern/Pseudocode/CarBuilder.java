package hus.oop.lab11.BuilderPattern.Pseudocode;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int numSeats) {
        car.setNumSeats(numSeats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripComputer) {
        car.setHasTripComputer(hasTripComputer);
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        car.setHasGPS(hasGPS);
        return this;
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
