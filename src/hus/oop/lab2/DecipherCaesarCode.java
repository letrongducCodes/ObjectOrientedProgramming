package hus.oop.lab2;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        String inChar = reader.nextLine().toUpperCase();
        System.out.println("The plaintext string is: ");
        decipherCaesarCode(inChar);
    }
    public static void decipherCaesarCode(String inStr) {
        int n = inStr.length();
        for (int i = 0; i < n; i++) {
            if (inStr.charAt(i) == 'X') {
                System.out.print("A");
            } else if (inStr.charAt(i) == 'Y') {
                System.out.print("B");
            } else if (inStr.charAt(i) == 'Z') {
                System.out.print("C");
            } else {
                System.out.print((char) (inStr.charAt(i) - 3));
            }
        }
    }
}
