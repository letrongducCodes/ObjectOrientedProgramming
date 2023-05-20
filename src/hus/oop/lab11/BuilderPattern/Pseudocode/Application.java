package hus.oop.lab11.BuilderPattern.Pseudocode;

public class Application {
    public static void main(String[] args) {
        makeCar();
    }

    public static void makeCar() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getProduct();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);

        Manual sportCarManual = manualBuilder.getResult();
        System.out.println(sportCarManual);

        director.constructSUV(manualBuilder);

        Manual SUVCarManual = manualBuilder.getResult();
        System.out.println(SUVCarManual);
    }
}
