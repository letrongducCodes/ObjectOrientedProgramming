package hus.oop.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Number of students: ");
        int numberStudents = reader.nextInt();
        int[] scores = inputScores(numberStudents,reader);
        System.out.println("The grades are: ");
        print(scores);
        double avgScore = getAverageScore(scores);
        double median = getMedian(scores);
        int minScore = getMinScore(scores);
        int maxScore = getMaxScore(scores);
        double standardDeviation = getStandardDeviation(scores);
        System.out.println();
        System.out.println("The avg score is: " + avgScore);
        System.out.println("The median is: " + median);
        System.out.println("The min score is: " + minScore);
        System.out.println("The max score is: " + maxScore);
        System.out.println("The standard deviation is: " + standardDeviation);
    }

    public static int[] inputScores(int numberStudents, Scanner reader) {
        int[] scores = new int[numberStudents];
        for (int i = 0; i <= numberStudents - 1; i++) {
            System.out.print("Score for student: " + (i+1) + ": ");
            scores[i] = reader.nextInt();
        }
        return scores;
    }

    public static void print(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if (i == 0) {
                System.out.print("[" + scores[i]);
            } else if (i == scores.length - 1) {
                System.out.print(", " + scores[i] + "]");
            } else {
                System.out.print(", " + scores[i]);
            }
        }
    }
    public static int getMinScore(int[] scores) {
        if (scores == null || scores.length == 0) {
            System.out.println("There are no students in class!");
            return -1;
        }
        int minScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            minScore = Math.min(minScore,scores[i]);
        }
        return minScore;
    }
    public static int getMaxScore(int[] scores) {
        if (scores == null || scores.length == 0) {
            System.out.println("There are no students in class!");
            return -1;
        }
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            maxScore = Math.min(maxScore,scores[i]);
        }
        return maxScore;
    }

    public static int getSumScores(int[] scores) {
        int sum = 0;
        for(int score : scores) {
            sum += score;
        }
        return sum;
    }

    public static double getAverageScore(int[] scores) {
        int sumScore = getSumScores(scores);
        if(sumScore == 0) {
            return 0.0;
        } else {
            return 1.0 * sumScore / scores.length;
        }
    }

    public static int[] sortArray(int[] scores) {
        Arrays.sort(scores);
        return scores;
    }

    public static double getMedian(int[] scores){
        double median;
        int[] array = sortArray(scores);
        if((scores.length % 2) != 0){
            median = array[scores.length / 2];
        } else {
            median = (array[(scores.length / 2) - 1] +
                    array[scores.length / 2]) / 2;
        }
        return median;
    }

    public static double getStandardDeviation(int[] scores){
        double standardDeviation = 0.0;
        double average = getAverageScore(scores);

        for(int x : scores){
            standardDeviation += Math.pow(x - average, 2);
        }

        standardDeviation /= scores.length;

        standardDeviation = Math.sqrt(standardDeviation);

        return Math.round(standardDeviation * 100.00) / 100.00;
    }
}
