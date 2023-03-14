package javaprogrammes;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class JavaProgramme5 {
    int a;
    int b;

    public static void addition(int a, int b) {
        int sum = a + b;
        System.out.println("Addition is : " + sum);

    }

    public static void substraction(int a, int b) {
        int sub = a - b;
        System.out.println("Substraction is :" + sub);

    }

    public void multiplication(int a, int b) {

        int mul = a * b;
        System.out.println("Multiplication is : " + mul);

    }

    public void division(int a, int b) {
        int div = a / b;
        System.out.println("Division is : " + div);

    }

    public static void main(String[] args) {

        JavaProgramme5 obj = new JavaProgramme5();
        addition(10, 20);
        substraction(10, 20);
        obj.multiplication(10, 20);
        obj.division(10, 20);
    }
}
