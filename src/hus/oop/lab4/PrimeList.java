package hus.oop.lab4;

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the upper bound: ");
        int n = reader.nextInt();
        findAndCountPrimeNumbers(n);
    }
    public static boolean isPrime(int aPosInt) {
        if(aPosInt <= 1)
            return false;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0)
                return false;
        }
        return true;
    }
    public static void findAndCountPrimeNumbers(int aPosInt) {
        int count = 0;
        for (int i = 2; i < aPosInt; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        double percent = (double) count * 100 / aPosInt;
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, percent);
    }
}
