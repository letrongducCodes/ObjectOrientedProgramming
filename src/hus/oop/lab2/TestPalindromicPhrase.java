package hus.oop.lab2;

import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String myString = reader.nextLine();
        if (testPalindromicPhrase(myString)) {
            System.out.println(myString + " is a phrase palindrome");
        } else {
            System.out.println(myString + " is not a phrase palindrome");
        }
    }
    public static boolean testPalindromicPhrase(String str)
    {
        int j = 0;
        int i = str.length()-1;
        str = str.toLowerCase();
        while(j <= i) {
            char getAtj = str.charAt(j);
            char getAti = str.charAt(i);
            if (!(getAtj >= 'a' && getAtj <= 'z'))
                j++;
            else if(!(getAti >= 'a' && getAti <= 'z'))
                i--;
            else if( getAtj == getAti) {
                j++;
                i--;
            }
            else
                return false;
        }
        return true;
    }
}
