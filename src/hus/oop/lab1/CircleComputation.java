package hus.oop.lab1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = reader.nextDouble();
        diameter(radius);
        area(radius);
        circumference(radius);
        reader.close();
    }

    public  static void diameter(double radius) {
        double diameter = 2 * radius;
        System.out.printf("Diameter is: %.2f%n" , diameter);
    }

    public static void area(double radius) {
        double area = Math.PI * radius * radius;
        System.out.printf("Area is: %.2f%n" , area);
    }

    public  static void circumference(double radius) {
        double circumference = 2.0 * Math.PI * radius;
        System.out.printf("Circumference is: %.2f%n" , circumference);
    }
}
