package hus.oop.lab3;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int NUM_ITEMS = reader.nextInt();
        System.out.println("Enter the value of all items: ");
        int[] items = inputItems(NUM_ITEMS,reader);
        System.out.println("The values are: ");
        printArray(items);
    }

    public static int[] inputItems(int NUM_ITEMS, Scanner reader) {
        int[] items = new int[NUM_ITEMS];
        for (int i = 0; i <= items.length - 1; i++) {
            items[i] = reader.nextInt();
        }
        return items;
    }
    public static void printArray(int[] items) {
        if (items.length == 0) {
            System.out.println("Empty array!");
        } else {
            System.out.print("[");
            for (int i = 0; i < items.length - 1; i++) {
                System.out.print(items[i] + ", ");
            }
            System.out.print(items[items.length - 1] + "]");
        }
    }
}
