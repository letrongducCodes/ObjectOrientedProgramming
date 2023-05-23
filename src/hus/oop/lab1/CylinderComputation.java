package hus.oop.lab1;

import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = reader.nextDouble();
        System.out.println("Enter the height: ");
        double height = reader.nextDouble();
        double baseArea = baseArea(radius);
        System.out.printf("The base area is: %.2f%n" , baseArea);
        surfaceArea(radius);
        volume(radius,height);
    }
    public static double baseArea(double radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }

    public static void surfaceArea(double radius) {
        double baseArea = baseArea(radius);
        double surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        System.out.printf("The surface area is: %.2f%n" , surfaceArea);
    }

    public static void volume(double radius, double height) {
        double volume = radius * height;
        System.out.printf("Volume is: %.2f%n" , volume);
    }
}
