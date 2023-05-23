package hus.oop.lab2;

import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String myString = reader.nextLine();
        if(testPalindromicWord(myString)) {
            System.out.println(myString + " is a palindrome");
        } else {
            System.out.println(myString + " is not a palindrome");
        }
    }

    public static boolean testPalindromicWord(String myString) {
        String rev = "";
        for (int i = myString.length() - 1; i >= 0; i--) {
            rev += myString.charAt(i);
        }
        if (myString.equals(rev)) {
            return true;
        }
        return false;
    }
}
