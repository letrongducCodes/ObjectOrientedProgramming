package hus.oop.lab1;

public class ExtractDigits {
    public static void main(String[] args) {
        int number = 15423;
        extractDigits(number);
    }

    public static void extractDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }
}
