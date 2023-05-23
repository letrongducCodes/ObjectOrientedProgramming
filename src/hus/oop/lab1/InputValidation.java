package hus.oop.lab1;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        boolean isValid = true;
        while (isValid) {
            System.out.println("Enter a number between 0-10 or 90-100: ");
            Scanner reader = new Scanner(System.in);
            int numberIn = reader.nextInt();
            if(numberIn >= 0 && numberIn <= 10) {
                System.out.println("You have entered:" + numberIn);
                isValid = false;
            } else if(numberIn >= 90 && numberIn <= 100) {
                System.out.println("You have entered:" + numberIn);
                isValid = false;
            } else {
                System.out.println("Invalid input, try again");
            }
        }
    }
}
