package hus.oop.lab11.BuilderPattern.Pseudocode;

public class Car {
    private boolean hasGPS;
    private boolean hasTripComputer;
    private int numSeats;
    private Engine engine;

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public void setHasTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car[seats = " + numSeats +
                ", engine = " + engine.engineType() +
                ", hasTripComputer = " + hasTripComputer +
                ", hasGPS = " + hasGPS + "]";
    }
}
