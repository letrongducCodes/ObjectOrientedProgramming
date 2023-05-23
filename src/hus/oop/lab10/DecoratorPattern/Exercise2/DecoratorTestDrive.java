package hus.oop.lab10.DecoratorPattern.Exercise2;

public class DecoratorTestDrive {
    public static void main(String[] args) {
        IceCream vani = new VanillaIceCream();
        System.out.println(vani.getDescription());
        System.out.println(vani.cost());

        vani = new HoneyTopping(vani);
        System.out.println(vani.getDescription());
        System.out.println(vani.cost());

        vani = new NutsTopping(vani);
        System.out.println(vani.getDescription());
        System.out.println(vani.cost());

        vani = new HoneyTopping(vani);
        System.out.println(vani.getDescription());
        System.out.println(vani.cost());
    }
}
