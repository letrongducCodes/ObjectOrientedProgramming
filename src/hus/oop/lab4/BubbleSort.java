package hus.oop.lab4;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int n = reader.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
        bubbleSort(array);
    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if(array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
