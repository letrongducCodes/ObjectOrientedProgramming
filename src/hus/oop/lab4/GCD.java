package hus.oop.lab4;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        System.out.println("The greatest common divisor of " + a + " and " + b + " is: " + gcd(a,b));
    }
    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
