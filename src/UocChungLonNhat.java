import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int gcd = 1;
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        for (int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The greatest common divisor of " + a + " and " + b + " is " + gcd);
    }
}
