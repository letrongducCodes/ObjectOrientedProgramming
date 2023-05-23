package hus.oop.lab2;
import java.util.Scanner;

public class Hex2Dec {
    public static int hexToDec(String hex){
        int dec = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            dec = dec * 16 + hexCharToDecimal(hexChar);

        }

        return dec;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= 'a' && ch <= 'f') {
            return 10 + ch - 'a';
        } else {
            return ch - '0';
        }

    }
    public static boolean isHexadecimalString(String inHex) {
        int n = inHex.length();
        for (int i = 0 ; i < n ; i++) {
            if (!((inHex.charAt(i) >= '0' && inHex.charAt(i) <= '9')
                    || (inHex.charAt(i) >= 'A' && inHex.charAt(i) <= 'F')
                    || (inHex.charAt(i) >= 'a' && inHex.charAt(i) <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inHex = reader.nextLine();
        char x = (char) hexToDec(inHex);
        hexCharToDecimal(x);
        if (isHexadecimalString(inHex)) {
            System.out.print("The equivalent decimal number for binary " + inHex + " is: " + hexToDec( inHex));
        } else {
            System.out.print("error: invalid hexadecimal string " + inHex);
        }
    }

}

