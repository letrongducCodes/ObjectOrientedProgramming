package hus.oop.lab4;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the upper bound: ");
        int n = reader.nextInt();
        findAndCountPrimeNumbers(n);
    }
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        for(int i = 2; i < aPosInt; i++) {
            if(aPosInt % (i*i) == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int aPosInt) {
        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0)
                return false;
        }
        return true;
    }
    public static void findAndCountPrimeNumbers(int aPosInt) {
        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int i = 2; i < aPosInt; i++) {
            if (!isPrime(i)) {
                if(isProductOfPrimeFactors(i)) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
        double percent = (double) count * 100 / aPosInt;
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, percent);
    }
}
