package hus.oop.lab4;

import java.util.Scanner;

public class LengthOfARunningNumberSequence {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        System.out.println("The length of Running Sequence is: " + lengthOfRunningNumberSequenceUsingLoop(n));
        System.out.println("The length of Running Sequence is: " + lengthOfRunningNumberSequenceUsingRecursive(n));
    }
    public static int lengthOfRunningNumberSequenceUsingLoop(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += numberOfDigits(i);
        }
        return count;
    }
    public static int lengthOfRunningNumberSequenceUsingRecursive(int n) {
        if(n == 1) {
            return 1;
        }
        return lengthOfRunningNumberSequenceUsingRecursive(n - 1) + numberOfDigits(n);
    }
    public static int numberOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
