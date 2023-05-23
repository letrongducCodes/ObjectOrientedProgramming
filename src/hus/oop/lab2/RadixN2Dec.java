package hus.oop.lab2;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the radix: ");
        int radix = reader.nextInt();
        System.out.println("Enter the string: ");
        reader.nextLine();
        String myString = reader.nextLine();
        radixToDecimal(myString, radix);
        char x = (char) radixToDecimal(myString,radix);
        digitToValue(x);
        System.out.println("The equivalent decimal number " + myString + " is: " + x);
    }

    public static int radixToDecimal(String number, int radix) {
        int decimal = 0;
        int base = 1;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = digitToValue(number.charAt(i));
            decimal += digit * base;
            base *= radix;
        }
        return decimal;
    }

    public static int digitToValue(char digit) {
        if (digit >= '0' && digit <= '9') {
            return digit - '0';
        } else {
            return digit - 'a' + 10;
        }
    }
}
