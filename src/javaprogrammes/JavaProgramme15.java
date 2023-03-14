package javaprogrammes;

/**
 * 15. Write a Java program to swap two variables.
 */
public class JavaProgramme15 {
    public static void main(String[] args) {

        int x = 100;
        int y = 200;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

