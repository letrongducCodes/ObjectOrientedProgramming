package hus.oop.lab2;
import java.util.Scanner;

public class Oct2Dec {

    public static int OctToDec(int oct){
        int dec = 0;
        int n = 0;
        //writing logic
        while(true){
            if(oct == 0){
                break;
            } else {
                int temp = oct % 10;
                dec += temp * Math.pow(8, n);
                oct = oct / 10;
                n++;
            }
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        int inOct = reader.nextInt();

        System.out.print("The equivalent decimal number for binary " + inOct + " is: " + OctToDec( inOct));

    }

}

