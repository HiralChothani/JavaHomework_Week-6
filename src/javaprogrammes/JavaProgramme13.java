package javaprogrammes;

import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class JavaProgramme13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double z;
        System.out.print("Input the first number: ");
        x = scanner.nextDouble();
        System.out.print("Input the second number: ");
        y = scanner.nextDouble();
        System.out.print("Input the third number: ");
        z = scanner.nextDouble();
        JavaProgramme13 obj = new JavaProgramme13();
        average(x, y, z);

        scanner.close();
    }

    public static void average(double x, double y, double z) {
        double result = (x + y + z) / 3;
        System.out.println("Average value of the numbers : " + result);
    }
}


