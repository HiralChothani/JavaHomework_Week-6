package javaprogrammes;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

public class JavaProgramme16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st binary number : ");
        String x = scanner.next();
        System.out.println("Enter 2nd binary number :");
        String y = scanner.next();


        int n1=Integer.parseInt(x, 2);
        int n2=Integer.parseInt(y, 2);
        int n3=n1+n2;

        System.out.println("n1 : "+Integer.toBinaryString(n1));
        System.out.println("n2 : "+Integer.toBinaryString(n2));
        System.out.println("n3=n1+n2 :  "+Integer.toBinaryString(n3));

        scanner.close();
    }
}
