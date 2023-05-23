package hus.oop.lab3;
import java.util.Scanner;
public class Hex2Bin {
    private static final String[] BITS = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    private static final String[] HEX_BITS = {"0000", "0001", "0010",
            "0011", "0100", "0101", "0110", "0111", "1000", "1001",
            "1010", "1011", "1100", "1101", "1110", "1111"};
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Hexadecimal string: ");
        String hex = reader.next();
        System.out.println(HexToBinary(hex));

    }
    public static String HexToBinary(String hexString){
        StringBuilder binaryStringBuilder = new StringBuilder();
        for (int i = 0; i < hexString.length(); i++) {
            char c = hexString.charAt(i);
            int value = Character.digit(c, 16);
            binaryStringBuilder.append(HEX_BITS[value]);
            binaryStringBuilder.append(" ");
        }
        return binaryStringBuilder.toString();
    }
}
