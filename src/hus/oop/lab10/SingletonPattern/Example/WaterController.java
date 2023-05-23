package hus.oop.lab10.SingletonPattern.Example;

public class WaterController {
    public static void main(String[] args) {
        WaterBoiler boiler = WaterBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        WaterBoiler boiler2 = WaterBoiler.getInstance();
        if(boiler == boiler2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
