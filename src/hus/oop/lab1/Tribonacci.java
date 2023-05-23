package hus.oop.lab1;

public class Tribonacci {
    public static void main(String[] args) {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int fnMinus3 = 2;
        int nMax = 20;
        System.out.println("The first " + nMax + " Tribonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " " + fnMinus3);
        tribonacci(n,nMax,fnMinus1,fnMinus2,fnMinus3);
    }

    public static void tribonacci(int n, int nMax, int fnMinus1, int fnMinus2, int fnMinus3) {
        int fn;
        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            n++;
            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = fn;
            System.out.print(" " + fn);
        }
    }
}
