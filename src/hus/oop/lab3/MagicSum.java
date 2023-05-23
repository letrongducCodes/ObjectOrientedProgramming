package hus.oop.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        final int FLAG = -1;
        Scanner reader = new Scanner(System.in);
        System.out.println("The magic sum is: " + getMagicSum(reader, FLAG));
        System.out.println("Enter the number of arrays: ");
        int n = reader.nextInt();
        int[] array = inputArray(n, reader);
        print(array);
        System.out.println("Enter the key: ");
        int key = reader.nextInt();
        if (contains(array, key)) {
            System.out.println("Array contains " + key);
        } else {
            System.out.println("Array doesn't contain " + key);
        }
        System.out.println(arrayToString(array));
        System.out.println(search(array, key));
        System.out.println("Enter the size for the 1st array: ");
        int array1_size = reader.nextInt();
        int[] array1 = new int[array1_size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = reader.nextInt();
        }
        System.out.println("Enter the size for the 2nd array: ");
        int array2_size = reader.nextInt();
        ;
        int[] array2 = new int[array2_size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = reader.nextInt();
        }
        if (swap(array1, array2)) {
            System.out.println("Array1 after swap: " + Arrays.toString(array1));
            System.out.println("Array2 after swap: " + Arrays.toString(array2));
        } else {
            System.out.println("Two arrays have different lengths");
        }
        System.out.println(equals(array1, array2));
        copyOf(array);
        reader.nextLine();
        System.out.println("Enter the newLength: ");
        int newLength = reader.nextInt();
        printArray(copyOf(array, newLength));
        reverse(array);
        System.out.println();
        printArray(array);
    }

    public static boolean hasEight(int number) {
        String stringNumber = Integer.toString(number);
        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) == '8') {
                return true;
            }
        }
        return false;
    }

    public static int getMagicSum(Scanner reader, int flag) {
        int magicSum = 0;
        System.out.print("Enter -1 to end: ");
        int number = reader.nextInt();
        while (number != flag) {
            if (hasEight(number)) {
                magicSum += number;
            }
            System.out.print("Enter -1 to end: ");
            number = reader.nextInt();
        }
        return magicSum;
    }

    public static int[] inputArray(int n, Scanner reader) {
        int[] array = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            array[i] = reader.nextInt();
        }
        return array;
    }

    public static void print(int[] array) {
        if (array.length == 0) {
            System.out.println("Empty array!");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1] + "]");
            System.out.println();
        }
    }

    public static String arrayToString(int[] array) {
        String arrayInString = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                arrayInString = "[" + array[i];
            } else if (i == array.length - 1) {
                arrayInString += ", " + array[i] + "]";
            } else {
                arrayInString += ", " + array[i];
            }
        }
        return arrayInString;
    }

    public static boolean contains(int[] array, int key) {
        boolean result = false;
        for (int i : array) {
            if (i == key) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int search(int[] array, int key) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] copyOf(int[] array) {
        System.out.println("The first array is :");
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        return copy;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] newArray = new int[newLength];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i]);
            } else if (i == array.length - 1) {
                System.out.print(", " + array[i] + "]");
            } else {
                System.out.print(", " + array[i]);
            }
        }
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    public static void reverse(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
    }
}
