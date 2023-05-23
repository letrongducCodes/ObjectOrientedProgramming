package hus.oop.lab1;

public class CheckOddEven {
    public static void main(String[] args) {
        int number = 49;
        checkOE(number);
        System.out.println("Bye!");
    }

    public static void checkOE(int number) {
        if(number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
