package hus.oop.lab11.BuilderPattern.Pseudocode;

public class Director {
    public Builder constructSportsCar(Builder builder) {
        builder.reset()
                .setSeats(2)
                .setEngine(new SportEngine())
                .setTripComputer(true)
                .setGPS(true);
        return builder;
    }

    public Builder constructSUV(Builder builder) {
        builder.reset()
                .setSeats(7)
                .setEngine(new SUVEngine())
                .setTripComputer(false)
                .setGPS(false);
        return builder;
    }
}
