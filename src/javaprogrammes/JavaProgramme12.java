package javaprogrammes;

import java.util.Scanner;

/**
 * 12. Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class JavaProgramme12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d; // 25.5
        double d1; // 3.5
        double d2;  //40.5
        double d3;  //4.5
        System.out.println("Enter d number : ");
        d = scanner.nextDouble();
        System.out.println("Enter d1 number : ");
        d1 = scanner.nextDouble();
        System.out.println("Enter d2 number : ");
        d2 = scanner.nextDouble();
        System.out.println("Enter d3 number : ");
        d3 = scanner.nextDouble();
        JavaProgramme12 obj = new JavaProgramme12();
        obj.formula(d, d1, d2, d3);
    }

    public void formula(double d, double d1, double d2, double d3) {

        double method = (d * d1 - d1 * d1) / (d2 - d3);
        System.out.println("d * d1 - d1 * d1) / (d2 - d3) = " + method);
        //   OR
        // System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

    }
}