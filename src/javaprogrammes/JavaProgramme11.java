package javaprogrammes;

import java.util.Scanner;

/**
 * 11. Write a Java program to display the following pattern.
 * Sample Pattern :
 * J a v v a
 * J a a v v a a
 * J J aaaaa V V aaaaa
 * J J a a V a a
 */
public class JavaProgramme11 {
    public static void main(String[] args) {
        String c1 = "j";
        String c2 = "a";
        String c3 = "v";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 1st letter");
        scanner.nextLine();
        System.out.println("Please enter 2nd letter");
        scanner.nextLine();
        System.out.println("Please enter 3rd letter");
        scanner.nextLine();

        System.out.println(c1.toUpperCase()+ " "+ c2.toLowerCase()+" "+c3.toLowerCase()+" "+c3.toLowerCase()+" "+c2.toLowerCase());
        System.out.println(c1.toUpperCase()+ " "+ c2.toLowerCase()+" "+c2.toLowerCase()+" "+c3.toLowerCase()+" "+c3.toLowerCase()+" "+c2.toLowerCase()+" "+c2.toLowerCase());
        System.out.println(c1.toUpperCase()+ " "+ c1.toUpperCase()+" "+c2.toLowerCase()+c2.toLowerCase()+c2.toLowerCase()+c2.toLowerCase()+c2.toLowerCase()+" "+c3.toUpperCase()+" "+c3.toUpperCase()+" "+c2.toLowerCase()+c2.toLowerCase()+c2.toLowerCase()+c2.toLowerCase()+c2.toLowerCase());
        System.out.println(c1.toUpperCase()+ " "+c1.toUpperCase()+" "+ c2.toLowerCase()+" "+c2.toLowerCase()+" "+c3.toUpperCase()+" "+c2.toLowerCase()+" "+c2.toLowerCase());

        scanner.close();
    }
}
