package hus.oop.lab2;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        String inChar = reader.nextLine().toUpperCase();
        System.out.println("The ciphertext string is: ");
        exchangeCipher(inChar);
    }
    public static void exchangeCipher(String inStr) {
        int n = inStr.length();
        for (int i = 0 ; i < n ; i++) {
            System.out.print( (char) ( 'A' + 'Z' - inStr.charAt(i)));
        }
    }
}
