package hus.oop.lab2;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = reader.nextInt();
        printAHillPattern(rows);
        System.out.println();
        printBHillPattern(rows);
        System.out.println();
        printCHillPattern(rows);
        System.out.println();
        printDHillPattern(rows);
    }
    public static void printAHillPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printBHillPattern(int size) {
        for (int row = size; row > 0; row--) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printCHillPattern(int size) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = size; row > 0; row--) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printDHillPattern(int size) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if((row + col > size + 1) && (row > col - size + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int row = size; row > 0; row--) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if((row + col > size + 1) && (row > col - size + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
