package javaprogrammes;

import java.util.Scanner;

/**
 * 19. Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class JavaProgramme19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String uppCase;
        System.out.println("Enter string in uppercase : ");
        uppCase = scanner.nextLine();
        lowCase(uppCase);

        scanner.close();
    }

    public static void lowCase(String uppCase) {
        String uppStr2 = uppCase.toLowerCase();
        System.out.println("String converted to lowercase : " + uppStr2);
    }

}
