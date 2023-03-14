package javaprogrammes;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class JavaProgramme4 {
    double x = 5.54; // instance variable
    double y = 10.80;    // instance variable
    static double a = 50.55;  // static variables
    static double b = 20.05;   // static variables

    public void instanceMethod() {    // instance method
        JavaProgramme4 obj = new JavaProgramme4();
        // call all 4 variables to instance method
        System.out.println(x);
        System.out.println(y);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

    public static void staticMethod() {   // static method
        JavaProgramme4 obj = new JavaProgramme4();
        // call all 4 variables to static method
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        JavaProgramme4 obj = new JavaProgramme4();
        //  call both method to main method.
        obj.instanceMethod();
        staticMethod();
    }
}
