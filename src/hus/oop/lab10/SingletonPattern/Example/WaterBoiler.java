package hus.oop.lab10.SingletonPattern.Example;

public class WaterBoiler {
    private static WaterBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private WaterBoiler() {
        empty = true;
        boiled = false;
    }

    public static WaterBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new WaterBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
