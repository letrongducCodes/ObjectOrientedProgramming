package hus.oop.lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        int sum = 0;
        for(int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            int markValidation = markValidation(studentNo);
            sum+= markValidation;
        }
        average(sum);
    }

    public static int markValidation(int studentNo) {
        int mark = 0;
        boolean isValid = true;
        while (isValid) {
            System.out.println("Enter the mark (0-100) for student " + studentNo + ": ");
            Scanner reader = new Scanner(System.in);
            mark = reader.nextInt();
            if(mark >= 0 && mark <= 100) {
                isValid = false;
            } else {
                System.out.println("Invalid input,try again");
            }
        }
        return mark;
    }

    public static void average(int sum) {
        double average = ((double) (sum) / 3);
        System.out.printf("The average is: %.2f%n" , average);
    }
}
