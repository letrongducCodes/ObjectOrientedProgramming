package hus.oop.lab3;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int NUM_ITEMS = reader.nextInt();
        System.out.println("Enter the value of all items: ");
        int[] items = inputItems(NUM_ITEMS,reader);
        printArray(items,NUM_ITEMS);
    }

    public static int[] inputItems(int NUM_ITEMS, Scanner reader) {
        int[] items = new int[NUM_ITEMS];
        for (int i = 0; i <= items.length - 1; i++) {
            items[i] = reader.nextInt();
        }
        return items;
    }
    public static void printArray(int[] items, int NUM_ITEMS) {
        for (int idx = 0; idx < items.length; ++idx) {
            System.out.println();
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {
                System.out.print("*");
            }
        }
    }
}
