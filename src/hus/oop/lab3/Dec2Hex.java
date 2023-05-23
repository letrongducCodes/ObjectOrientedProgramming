package hus.oop.lab3;
import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = reader.nextInt();
        Dec2Hex(decimal);
    }
    public static void Dec2Hex(int decimal) {
        String hexadecimal = "";
        int remainder;
        while (decimal != 0) {
            remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal = remainder + hexadecimal;
            } else {
                hexadecimal = (char) (remainder + 55) + hexadecimal;
            }
            decimal /= 16;
        }
        System.out.println("The equivalent hexadecimal number is " +
                hexadecimal);
    }
}
