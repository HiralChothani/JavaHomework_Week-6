package javaprogrammes;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class JavaProgramme18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;   //125;
        int y;   //24;
        System.out.println("Input first number : ");
        x = scanner.nextInt();
        System.out.println("Input second number : ");
        y = scanner.nextInt();

        JavaProgramme18 obj = new JavaProgramme18();
        obj.result(x, y);

    }

    public void result(int x, int y) {

        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " x " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " mod " + y + " = " + (x % y));

    }
}
