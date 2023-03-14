package javaprogrammes;

import java.util.Scanner;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class JavaProgramme10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int table = scanner.nextInt();
        myMethod(table);

        scanner.close();

    }

    public static void myMethod(int table) {
        System.out.println("8 X 1 = " + 1 * table);
        System.out.println("8 X 2 = " + 2 * table);
        System.out.println("8 X 3 = " + 3 * table);
        System.out.println("8 X 4 = " + 4 * table);
        System.out.println("8 X 5 = " + 5 * table);
        System.out.println("8 X 6 = " + 6 * table);
        System.out.println("8 X 7 = " + 7 * table);
        System.out.println("8 X 8 = " + 8 * table);
        System.out.println("8 X 9 = " + 9 * table);
        System.out.println("8 X 10 = " + 10 * table);


    }
}
