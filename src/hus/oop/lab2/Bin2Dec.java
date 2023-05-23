package hus.oop.lab2;

import java.util.Scanner;
public class Bin2Dec {

    public static int bin2Dec(int bin){
        int dec = 0;
        int n = 0;
        while(true){
            if(bin == 0){
                break;
            } else {
                int temp = bin%10;
                dec += temp * Math.pow(2, n);
                bin = bin / 10;
                n++;
            }
        }
        return dec;
    }
    public static boolean isBinaryString(int inBin) {
        int n = inBin;
        while ( n > 0 ) {
            if (!(inBin % 10 == 1 || inBin % 10 == 0)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        int inBin = reader.nextInt();
        bin2Dec(inBin);
        if (isBinaryString(inBin)) {
            System.out.print("The equivalent decimal number for binary " + inBin + " is: " + bin2Dec( inBin));
        } else {
            System.out.print("error: invalid binary string " + inBin);
        }
    }

}
