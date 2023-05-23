package hus.oop.lab2;

import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = reader.nextInt();
        printingCheckerboardPattern(size);
    }
    public static void printingCheckerboardPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size ; col++) {
                if ((row % 2) == 0) {
                    System.out.print(" ");
                }
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
