package hus.oop.lab1;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        final int LOWERBOUND1 = 111;
        final int UPPERBOUND1 = 8899;
        sumAverageUsingForLoop(LOWERBOUND,UPPERBOUND);
        sumAverageUsingWhileDoLoop(LOWERBOUND,UPPERBOUND);
        sumAverageUsingDoWhileLoop(LOWERBOUND,UPPERBOUND);
        sumAverage(LOWERBOUND1,UPPERBOUND1);
        sumOfTheSquares(UPPERBOUND);
        sumOfOddsNumberAndEvensNumber(UPPERBOUND);
    }

    public static void sumAverageUsingForLoop(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        for(int i = lowerBound; i <= upperBound; i++) {
            sum += i;
            count++;
        }
        double average = (double) sum /count;
        System.out.println("Sum average using for: " + average);
    }

    public static void sumAverageUsingWhileDoLoop(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        int index = lowerBound;
        while (index <= upperBound) {
            sum += index;
            count++;
            index++;
        }
        double average = (double) sum / count;
        System.out.println("Sum average using while-do: " + average);
    }

    public static void sumAverageUsingDoWhileLoop(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        int number = lowerBound;
        do {
            sum += number;
            ++number;
            count++;
        } while (number <= upperBound);
        double average = (double) sum / count;
        System.out.println("Sum average using do-while: " + average);
    }

    public static void sumAverage(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        int number = lowerBound;
        do {
            sum += number;
            ++number;
            count++;
        } while (number <= upperBound);
        double average = (double) sum / count;
        System.out.println("Sum average is: " + average);
    }

    public static void sumOfTheSquares(int number) {
        int sum = 0;
        for(int i = 1; i <= number; i++) {
            sum += (i * i);
        }
        System.out.println("The sum of the squares is: " + (double) sum);
    }

    public static void sumOfOddsNumberAndEvensNumber(int number) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i <= number; i++) {
            if(i % 2 == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        System.out.println("Sum of even numbers is: " + (double) sum1);
        System.out.println("Sum of odd numbers is: " + (double) sum2);
    }
}