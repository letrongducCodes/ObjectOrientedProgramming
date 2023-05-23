package hus.oop.lab1;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int inNumber = reader.nextInt();
        System.out.println("The reverse is: ");
        findTheReverseNumber(inNumber);
    }

    public static void findTheReverseNumber(int inNumber) {
        while (inNumber > 0) {
            int inDigit = inNumber % 10;
            inNumber /= 10;
            System.out.print(inDigit + "");
        }
    }
}
