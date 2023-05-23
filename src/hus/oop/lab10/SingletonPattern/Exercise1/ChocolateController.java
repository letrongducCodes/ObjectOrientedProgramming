package hus.oop.lab10.SingletonPattern.Exercise1;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        if(boiler == boiler2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        int global = ChocolateBoiler.getInstance().getGlobalValue();
        System.out.println(global);
    }
}
