package javaprogrammes;

import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class JavaProgramme6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of a circle : ");
        double radius = scanner.nextDouble();
        area(radius);

        scanner.close();

    }

    public static void area(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area is = " + area);
    }
}
