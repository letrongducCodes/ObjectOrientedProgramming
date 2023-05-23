package hus.oop.lab4;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int n = reader.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
        selectionSort(array);
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIdx = i;
            for(int j = i + 1; j < array.length; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
            }
            if(minIdx != i) {
                int temp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = temp;
            }
            System.out.print(array[i] + " ");
        }
    }
}
