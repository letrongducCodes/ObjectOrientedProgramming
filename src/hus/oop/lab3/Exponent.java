package hus.oop.lab3;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = reader.nextInt();
        System.out.println("Enter the exponent: ");
        int exp = reader.nextInt();
        System.out.println(base + " raises to the power of " + exp +
                " is: " + getExponent(base,exp));
    }

    public static int getExponent(int base, int exp) {
        int multiply = 1;
        for (int i = 0; i < exp; i++) {
            multiply *= base;
        }
        return multiply;
    }
}
