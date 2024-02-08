package control_flow;

/*
 * In Java Class Library contains "Scanner"
 * from the "java.util" package
 */
import java.util.Scanner;

/**
 * Working with Conditions
 * 
 * Introduction to "java" command:
 * ******************************
 * The "java" command starts a Java application.
 * It does this by starting the Java Virtual Machine (JVM),
 * loading the specified class, and calling that class's main() method.
 * The method must be declared "public" and "static",
 * it must not return any value,
 * and it must accept a String array as a parameter.
 * The method declaration has the following form:
 * public static void main(String[] args)
 * 
 * Link: https://docs.oracle.com/en/java/javase/20/docs/specs/man/java.html
 * 
 * For running this application:
 * > java Condition.java
 * 
 * Error: Could not find or load main class Condition.java
 * Caused by: java.lang.ClassNotFoundException: Condition.java
 * 
 * "week05" root folder => "src" folder => "control_flow" sub-folder =>
 * Condition.java
 * 
 * "Folder" <==> "Directory"
 */
public class Condition {
    public static void main(String[] args) {
        // Always prepare our Scanner object for reading
        Scanner input = new Scanner(System.in);

        // double avg = 80; // Hard Coding the values:
        System.out.print("Enter the student's average: ");
        /*
         * We need to use the "object" of type class "Scanner"
         * this object for reading the user input
         * 
         * Read user input
         * using the method .nextDouble()
         * returns => the double scanned from the input
         */
        double studentAvg = input.nextDouble();
        /*
         * If the student's average is equal or greater to 50
         * Then => type: "Good, you passed the module"
         * Else => type: "Try again!"
         * 
         * 6 Conditional Operators:
         * == equal to
         * != not equal to
         * > greater than
         * >= greater than or equal to
         * < less than
         * <= less than or equal to
         * 
         * The basic template:
         * if (condition) {
         * // The code if the condition is True
         * } else {
         * // The code if the condition is False
         * }
         */

        if (studentAvg >= 50) {
            // write my code if the condition is true:
            System.out.println("Good, you passed the module");
        } else {
            // write my code if the condition is false:
            System.out.println("Try again!");
        }

        /*
         * we also have the block of "else if" if we need
         * but in this simple example no need to use it!
         * because the condition can have only two results either or
         * 
         * But we can try it :-)
         * notice that "if (studentAvg < 50)" not necessary
         */
        if (studentAvg >= 50) {
            // write my code if the condition is true:
            System.out.println("Again! You passed the module");
        } else if (studentAvg < 50) {
            // write my code if the condition is false:
            System.out.println("No worries, try again!");
        }

        // Below is better example about using multiple if/else blocks:
        // ************************************************************
        /*
         * Problem:
         * - scan/read the average value and check:
         * - if the average is 90+ AND less or equal to 100
         * ==> (90-100) ==> Excellent
         * 
         * - else if the average is 80+ AND less or equal to 89
         * ==> (80-89) ==> Very Good
         * 
         * - else if the average is 70+ AND less or equal to 79
         * ==> (70-79) ==> Good
         * 
         * - else if the average is 60+ AND less or equal to 69
         * ==> (60-69) ==> Satisfactory
         * 
         * - else if the average is 0+ and less than 60 ==> (<60) ==> Fail
         * - else ==> Invalid Average Value
         * 
         * Reverse the logic:
         */

        /*
         * declare the variable named "grade"
         * in the class scope (out side the if/else blocks)
         * to make it "global" through all code
         * 
         * "global" variable:
         * - declared inside the class but outside any "block"
         * - Inside main() block or inside the class itself
         */

        // starting the minimum grade of 60 and moving to the higher grades:
        String result; // Just declare a variable (No initializing)
        if (studentAvg < 60) {
            // System.out.println("Fail");
            result = "Fail";
        } else if (studentAvg < 70) {
            // System.out.println("Satisfactory");
            result = "Satisfactory";
        } else if (studentAvg < 80) {
            // System.out.println( );
            result = "Good";
        } else if (studentAvg < 90) {
            result = "very Good";
        } else if (studentAvg < 100) {
            result = "Excellent";
        } else {
            result = "Invalid Average Value!";
        }

        System.out.println(result);
        input.close(); // Closes this scanner.
    } // main()
} // class file