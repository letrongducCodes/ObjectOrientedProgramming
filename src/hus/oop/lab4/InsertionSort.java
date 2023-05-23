package hus.oop.lab4;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int n = reader.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
        insertionSort(array);
    }
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int keyIdx = i;
            int key = array[i];
            while ((keyIdx > 0) && (key < array[keyIdx - 1])) {
                array[keyIdx] = array[keyIdx - 1];
                keyIdx--;
            }
            array[keyIdx] = key;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
