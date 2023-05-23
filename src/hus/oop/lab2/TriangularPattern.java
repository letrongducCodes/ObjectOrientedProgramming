package hus.oop.lab2;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = reader.nextInt();
        printATriangularPattern(size);
        printBTriangularPattern(size);
        printCTriangularPattern(size);
        printDTriangularPattern(size);
    }
    public static void printATriangularPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    public static void printBTriangularPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printCTriangularPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row < col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printDTriangularPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
