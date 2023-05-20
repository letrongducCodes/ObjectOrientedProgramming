package hus.oop.lab11.BuilderPattern.Pseudocode;

public interface Builder {
    Builder reset();
    Builder setSeats(int numSeats);
    Builder setEngine(Engine engine);
    Builder setTripComputer(boolean hasTripComputer);
    Builder setGPS(boolean hasGPS);
}