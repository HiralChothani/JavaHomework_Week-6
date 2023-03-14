package javaprogrammes;

import java.util.Scanner;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class JavaProgramme14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w; // 5.5
        double h; // 8.5
        System.out.println("Enter width of rectangle : ");
        w = scanner.nextDouble();
        System.out.println("Enter height of rectangle :");
        h = scanner.nextDouble();
        JavaProgramme14 obj = new JavaProgramme14();
        obj.area(w, h);

        scanner.close();

    }

    public void area(double w, double h) {
        double areaResult = w * h;
        System.out.println("Area of the rectangle is " + areaResult);
        double perimeterResult = 2 * (w + h);
        System.out.println("Perimeter of the rectangle is " + perimeterResult);
    }
}
