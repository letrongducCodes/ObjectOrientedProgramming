package hus.oop.lab1;

import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = reader.nextDouble();
        surfaceArea(radius);
        volume(radius);
    }

    public static void surfaceArea(double radius) {
        double surfaceArea = 4 * Math.PI * radius * radius;
        System.out.printf("Surface Area is: %.2f%n" , surfaceArea);
    }

    public static void volume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.printf("Volume is: %.2f%n" , volume);
    }
}
