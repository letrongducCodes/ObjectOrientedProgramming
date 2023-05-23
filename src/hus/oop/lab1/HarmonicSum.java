package hus.oop.lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        System.out.println("The sum from left-to-right is: " + sumFromLeftToRight(MAX_DENOMINATOR));
        System.out.println("The sum from right-to-left is: " + sumFromRightToLeft(MAX_DENOMINATOR));
        sumL2R = sumFromLeftToRight(MAX_DENOMINATOR);
        sumR2L = sumFromRightToLeft(MAX_DENOMINATOR);
        if(sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
            System.out.println(absDiff);
        } else {
            absDiff = sumR2L - sumL2R;
            System.out.println(absDiff);
        }
    }

    public static double sumFromLeftToRight(int maxDenominator) {
        double sumL2R = 0;
        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            sumL2R += (double) 1 / denominator;
        }
        return sumL2R;
    }

    public static double sumFromRightToLeft(int maxDenomninator) {
        double sumR2L = 0;
        for(int denominator = maxDenomninator; denominator >= 1; denominator--) {
            sumR2L += (double) 1 / denominator;
        }
        return sumR2L;
    }
}
