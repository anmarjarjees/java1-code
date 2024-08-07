package exceptions_intro;

import java.util.Scanner;

public class ExceptionIdea {
    public static void main(String[] args) {
        /*
         * Exception:
         * An event that occurs during the execution of a program that disrupts
         * the normal flow of instructions.
         */
        Scanner input = new Scanner(System.in);
        /*
         * Task:
         * 1) Ask the user to input two numeric values:
         * - Fist value for "Numerator"
         * - Second value for "Denominator"
         * 
         * 2) Divide and Get the answer:
         * Answer = Numerator/Denominator
         * 
         * Example:
         * - 90 => Numerator
         * - 80 => Denominator
         * answer = 90/80
         * 90 => the numerator
         * 80 => the denominator
         */

        System.out.print("Enter any number to divide (the numerator): ");
        // nextDouble() => to accept any number => integers or decimals
        // 9 => 9.0 or 73.68 => 73.68
        double num1 = input.nextDouble(); // user might enter string values!!!

        System.out.print("Enter any number to divide by (the denominator): ");
        double num2 = input.nextDouble();

        double result = num1 / num2;

        System.out.println("The result of dividing " + num1 + " by " + num2 + " is: "
                + result);

        /*
         * NOTE:
         * *****
         * With "double" data types, if the denominator value is 0:
         * Java will show this error message below:
         * "The result of dividing 9.0 by 0.0 is: Infinity"
         * 
         * Then will continue running the code...
         */

        /*
         * Repeat the same logic/task
         * But with using integer input with nextInt() method,
         * In such case, if the denominator value is 0, Java will throw an exception
         */

        System.out.print("Enter your first whole (integer) number (the numerator): ");
        int n1 = input.nextInt(); // can only accept integer numeric values
        System.out.print("Enter your second whole (integer) number (the denominator): ");
        int n2 = input.nextInt(); // 0
        double div = (double) n1 / n2; // dividing by 0!!!
        System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + div);
        // Notice that the division result will always be 0.0 - Refer to the note below:

        /*
         * NOTE:
         * *****
         * In Java, when we divide two integers,
         * the result will be also integer,
         * which means any fractional part will be truncated.
         * 
         * Example:
         * If we divide 10 by 20 => result is 0
         * Because integer division does not consider the fractional part.
         * 
         * Solution:
         * - We need to ensure that at least one operand in the division is a "double".
         * This can be easily done by casting one of the integers to a double:
         * double div = (double) n1 / n2;
         */

        // **********************************************
        // more examples :-)
        // Creating an Array => A variable that contains a list of different values:
        String[] names = { "Alex", "Sam", "Kate", "Martin", "Sarah" };
        // In PHP => $names = ["Alex", "Sam", "Kate", "Martin", "Sarah"];
        // In JS => names = ["Alex", "Sam", "Kate", "Martin", "Sarah"];

        // names.length = 5 elements => we have to loop 4 times => starting from 0
        // the loop counter variable "index" => 0, 1, 2, 3, 4
        // we are looping till index 5! => the highest index is 4
        for (int index = 0; index < 6; index++) {
            System.out.println("Name: " + names[index]);
        }

        input.close();
        /*
         * Analyzing Exception messages:
         * *****************************
         * 
         * - Exception in thread "main" java.util.InputMismatchException
         * > Exception <==> Error
         * > thread => one task => main()
         * > main => main()
         * > java.util.InputMismatchException:
         * InputMismatchException => Java Class for this type of Exception (Error)
         * "InputMismatchException" class is from the package "java.util"
         * 
         * 
         * Dividing by 0 for integers:
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * > java.lang.ArithmeticException
         * 
         * 
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
         * Index 5 out of bounds for length 5
         * > java.lang.ArrayIndexOutOfBoundsException
         * 
         * As conclusion :-)
         * We have examined 3 types of exceptions:
         * - java.util.InputMismatchException
         * - java.lang.ArithmeticException/ by zero => only with integer values
         * - java.lang.ArrayIndexOutOfBoundsException *
         */
    } // main()
} // Class
