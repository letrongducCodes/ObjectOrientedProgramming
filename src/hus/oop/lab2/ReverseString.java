package hus.oop.lab2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String myString = reader.nextLine();
        System.out.println("The reverse of the String " + myString +
                " is ");
        System.out.print(reverseString(myString));
    }

    public static String reverseString(String inStr) {
        String reverseString = "";
        for (int charIndex = inStr.length() - 1; charIndex >= 0; --charIndex) {
            reverseString += inStr.charAt(charIndex);
        }
        return reverseString;
    }
}
