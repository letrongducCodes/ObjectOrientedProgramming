package hus.oop.lab1;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;
        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2);
        fibonacci(n,nMax,fnMinus1,fnMinus2);
        average = theAverageOfNFibonacci(n,nMax,fnMinus1,fnMinus2,sum);
        System.out.println("\nThe average is " + average);
    }

    public static void fibonacci(int n, int nMax, int fnMinus1, int fnMinus2) {
        int fn;
        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            n++;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            System.out.print(" " + fn);
        }
    }

    public static double theAverageOfNFibonacci(int n, int nMax, int fnMinus1, int fnMinus2, int sum) {
        int fn;
        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            n++;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            sum += fn;
        }
        return (double) sum / nMax;
    }
}
