package hus.oop.lab2;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = reader.nextLine();
        if(isHexString(inStr)) {
            System.out.println(inStr + " is a hex string");
        } else {
            System.out.println(inStr + " is not a hex string");
        }
    }

    public static boolean isHexString(String inStr) {
        int n = inStr.length();
        for (int i = 0; i < n; i++) {
            if (!((inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9')
                    || (inStr.charAt(i) >= 'A' && inStr.charAt(i) <= 'F')
                    || (inStr.charAt(i) >= 'a' && inStr.charAt(i) <= 'f'))) {
                return false;
            }
        }
        return true;
    }
}
