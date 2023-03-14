package javaprogrammes;

import java.util.Scanner;

/**
 * 8. Write a program to calculate the area of a triangle.
 */
public class JavaProgramme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base;
        double height;

        System.out.println("Enter the width of the Triangle : ");
        base = scanner.nextDouble();
        System.out.println("Enter the height of the Triangle : ");
        height = scanner.nextDouble();
        triangle(base, height);

        scanner.close();

    }

    public static void triangle(double base, double height) {
        double area = (base * height) / 2;
        System.out.println("Area of the triangle is : " + area);

    }

}
