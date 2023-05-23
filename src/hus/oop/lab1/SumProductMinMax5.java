package hus.oop.lab1;

import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int number1 = reader.nextInt();
        System.out.println("Enter 2nd integer: ");
        int number2 = reader.nextInt();
        System.out.println("Enter 3rd integer: ");
        int number3 = reader.nextInt();
        System.out.println("Enter 4th integer: ");
        int number4 = reader.nextInt();
        System.out.println("Enter 5th integer: ");
        int number5 = reader.nextInt();
        sum(number1,number2,number3,number4,number5);
        product(number1,number2,number3,number4,number5);
        min(number1,number2,number3,number4,number5);
        max(number1,number2,number3,number4,number5);
        reader.close();
    }

    public static void sum(int number1, int number2, int number3, int number4, int number5) {
        int sum = number1 + number2 + number3 + number4 + number5;
        System.out.println("The sum is: " + sum);
    }

    public  static void product(int number1, int number2, int number3, int number4, int number5) {
        int product = number1 * number2 * number3 * number4 * number5;
        System.out.println("The product is: " + product);
    }

    public static void min(int number1, int number2, int number3, int number4, int number5) {
        int min = number1;
        if(min > number2) {
            min = number2;
        }
        if(min > number3) {
            min = number3;
        }
        if(min > number4) {
            min = number4;
        }
        if(min > number5) {
            min = number5;
        }
        System.out.println("The min is: " + min);
    }

    public static void max(int number1, int number2, int number3, int number4, int number5) {
        int max = number1;
        if(max < number2) {
            max = number2;
        }
        if(max < number3) {
            max = number3;
        }
        if(max < number4) {
            max = number4;
        }
        if(max < number5) {
            max = number5;
        }
        System.out.println("The max is: " + max);
    }
}
