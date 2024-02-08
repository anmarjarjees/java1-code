package math_review;

import java.util.Scanner;

// ALT+SHIFT+F => Format your code
// a folder "math_review" contains a file "PaymentCalculator.java"
public class PaymentCalculator {
    public static void main(String[] args) {
        /*
         * Our application will accept an input from a user
         * we need to use "Scanner"
         * the class "Scanner" is coming from the package "java.util"
         * 
         * So we have to import the "Scanner" from "java.util"
         * using the keyword "import" at very top of the file
         * below the package statement
         */
        Scanner sc = new Scanner(System.in);

        // 1. How many hours did you work:
        System.out.println("How many hours did you work?");

        // assuming it's fixed whole number of hours: 4,8,10,...
        int hours = sc.nextInt();

        // 2. The hourly pay rate:
        System.out.println("What is your pay rate?");
        double payRate = sc.nextDouble();

        /*
         * The Arithmetic Operators
         * ************************
         * The Java programming language provides operators that perform:
         * - addition => + Additive operator (also used for String concatenation)
         * - subtraction => - Subtraction operator
         * - multiplication => * Multiplication operator
         * - division. => / Division operator
         * - % Remainder operator
         * The only symbol that might look new to you is "%",
         * which divides one operand by another and
         * returns the remainder as its result.
         * 
         * Link: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
         */

        // Do the calculation:
        double payPerWeek = hours * payRate;

        // finally :-) print the result
        // Gross Pay: 45
        System.out.println("Gross Pay: " + payPerWeek);

        // Warning: Resource leak: 'sc' is never closed
        // We should close the scanner after finishing:
        sc.close();
    }
} // class file
