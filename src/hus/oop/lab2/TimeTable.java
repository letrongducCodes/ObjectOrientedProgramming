package hus.oop.lab2;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = reader.nextInt();
        printTimeTable(size);
    }
    public static void printTimeTable(int size) {
        for(int i = -1; i <= size; i++)
        {
            if (i == -1) {
                System.out.print("\t|");
            }
            else if (i == 0) {
                System.out.print("------------");
            }
            else if (i > 0) {
                System.out.printf("%1$d\t|", i);
            }

            for(int j = 1; j <= size; j++)
            {
                if (i == -1) {
                    System.out.printf("\t%1$d", j);
                    continue;
                }
                else if (i == 0) {
                    System.out.print("--------");
                    continue;
                }

                System.out.printf("\t%1$d", i * j);
            }
            System.out.println();
        }
    }
}
