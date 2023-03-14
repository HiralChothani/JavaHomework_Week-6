package javaprogrammes;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class JavaProgramme3 {
    int a = 100;   // instance variable.

    static int b = 101;     // static variable.

    public void instanceMethod() {   // instance method
        JavaProgramme3 obj = new JavaProgramme3();
        // call both variable to instance method
        System.out.println(a);
        System.out.println(obj.b);
    }

    public static void staticMethod() {  // static method
        JavaProgramme3 obj = new JavaProgramme3();
        //call both variable to static method
        System.out.println(obj.a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        JavaProgramme3 obj = new JavaProgramme3();
        // call both method to main method.
        obj.instanceMethod();
        staticMethod();
    }

}
