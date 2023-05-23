package hus.oop.lab1;

public class ComputePI {
    public static void main(String[] args) {
        int MAX_DENOMINATOR = 1000;
        System.out.println("PI = " + computePI(MAX_DENOMINATOR));
        System.out.println("PI = " + computePIUsingMaximumNumberOfTerms(MAX_DENOMINATOR));
        double piComputed1 = computePI(MAX_DENOMINATOR);
        double piComputed2 = computePIUsingMaximumNumberOfTerms(MAX_DENOMINATOR);
        double x1 = (piComputed1 / Math.PI) * 100;
        double x2 = (piComputed2 / Math.PI) * 100;
        System.out.println(x1);
        System.out.println(x2);
    }

    public static double computePI(int maxDenominator) {
        double sum = 0.0;
        for(int denominator = 1; denominator < maxDenominator; denominator+= 2) {
            if(denominator % 4 == 1) {
                sum += (double) 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= (double) 1 / denominator;
            } else {
                System.out.println("Impossible!");
            }
        }
        return sum * 4;
    }

    public static double computePIUsingMaximumNumberOfTerms(int MAX_TERM) {
        int sum = 0;
        for(int term = 1; term <= MAX_TERM; term++) {
            if(term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            } else {
            }
        }
        return sum;
    }
}
