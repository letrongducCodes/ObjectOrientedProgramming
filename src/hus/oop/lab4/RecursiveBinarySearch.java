package hus.oop.lab4;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
        int key = reader.nextInt();
        int leftIdx = 0;
        int rightIdx = n - 1;
        System.out.println(binarySearchUsingWhile(sort(array),key,leftIdx,rightIdx));
    }
    public static int binarySearchUsingWhile(int[] sortedArray, int key, int leftIdx, int rightIdx) {
        while (leftIdx <= rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            if(sortedArray[midIdx] == key) {
                return midIdx;
            }
            if (sortedArray[midIdx] > key) {
                rightIdx = midIdx - 1;
            } else {
                leftIdx = midIdx + 1;
            }
        }
        return -1;
    }
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
