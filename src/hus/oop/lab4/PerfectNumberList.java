package hus.oop.lab4;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the upper bound: ");
        int n = reader.nextInt();
        findAndCountPefectNumbers(n);
        System.out.println();
        System.out.println("These numbers are neither deficient nor perfect: ");
        findAndCountNeitherDeficientNorPerfectNumbers(n);
    }
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if(aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt) {
            return true;
        } else {
            return false;
        }
    }
    public static void findAndCountPefectNumbers(int aPosInt) {
        int count = 0;
        System.out.println("These numbers are perfect: ");
        for (int i = 2; i < aPosInt; i++) {
            if(isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        double percent = (double) count * 100 / aPosInt;
        System.out.println();
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, percent);
    }

    public static void findAndCountNeitherDeficientNorPerfectNumbers(int aPosInt) {
        int count = 0;
        for (int i = 2; i < aPosInt; i++) {
            if(!isDeficient(i) && !isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        double percent = (double) count * 100 / aPosInt;
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, percent);
    }
}
