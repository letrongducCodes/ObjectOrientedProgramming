package hus.oop.lab2;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = reader.nextInt();
        char myChar = '*';
        printSquareUsingForLoops(size,myChar);
        printSquareUsingWhileDoLoops(size,myChar);
    }
    public static void printSquareUsingForLoops(int size, char myChar) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(col == size - 1) {
                    System.out.print(myChar);
                } else {
                    System.out.print(myChar + " ");
                }
            }
            if(row < size - 1) {
                System.out.println();
            }
        }
    }
    public static void printSquareUsingWhileDoLoops(int size, char myChar) {
        int row = 0;
        while(row < size) {
            int col = 0;
            while (col < size) {
                    System.out.print(myChar + " ");
                    col++;
            }
            System.out.println();
            row++;
            }
        }
}
