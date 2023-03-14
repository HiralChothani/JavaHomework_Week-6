package javaprogrammes;

import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius (5.0 / 9.0 * (f - 32)).
 */
public class JavaProgramme7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature in Fahrenheit : ");
        double f = scanner.nextDouble();
        JavaProgramme7 obj = new JavaProgramme7();
        obj.temperature(f);

        scanner.close();

    }

    public void temperature(double f){
        double c = 5.0 / 9.0 * (f - 32);
        System.out.println("Temperature in Degree Celsius is : " + c +"°C");

    }
    }

