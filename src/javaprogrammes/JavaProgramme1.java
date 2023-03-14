package javaprogrammes;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class JavaProgramme1 {
    int a = 5;     // Instance variables
    int b = 9;    // Instance variables

    public void addition() {    //  instance method

        // Call instance variables into the instance method inside the print statement.
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {    // Main Method

        // call Instance method into the Main method
        JavaProgramme1 method = new JavaProgramme1();
        method.addition();
    }

}
