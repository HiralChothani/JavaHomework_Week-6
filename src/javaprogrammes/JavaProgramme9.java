package javaprogrammes;

import java.util.Scanner;

/**
 * 9. Write a program to convert the upper case to lower case.
 */
public class JavaProgramme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String uppStr;
        System.out.println("Enter any upper case letter to convert : ");
        uppStr = scanner.nextLine();
        JavaProgramme9 obj = new JavaProgramme9();
        obj.lowerCase(uppStr);

        scanner.close();

    }

    public void lowerCase(String uppStr) {
        String uppStr2 = uppStr.toLowerCase();
        System.out.println("The letter in lowercase : " + uppStr2);

    }
}



