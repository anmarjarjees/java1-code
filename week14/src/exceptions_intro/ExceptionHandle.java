package exceptions_intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) {
        /*
         * "input" is declared inside the main() method,
         * it can be accessed from any block inside the main()
         */

        /*
         * Review/Recap => When dividing a number by Zero:
         * > Java can handle the double values => without throwing an exception
         * > Java will throw an exception with integer values
         * 
         * First Exception:
         * - InputMismatchException => input a string value instead of integer value!
         * 
         * Solution:
         * Use try/catch block: [ block <==> { } ]
         * Try to run this code inside "try" block,
         * if something goes wrong "catch" block will catch it :-)
         * 
         * - We can have one try block with at least one or many catch blocks
         * - Another optional block => "finally" block
         * 
         * catch => needs the "ExceptionName" with the variable (object of that
         * exception)
         * 
         * NameException:
         * > InputMismatch Exception => InputMismatchException
         * > Arithmetic Exception => ArithmeticException
         * > ArrayIndexOutOfBounds Exception => ArrayIndexOutOfBoundsException
         * 
         * Review:
         * Variable Scope => variable declared inside the block of code
         */
        Scanner input = new Scanner(System.in); // this code doesn't generate any error/exception
        // optional inside/outside the try block

        try {
            // write my main code:
            // Not mandatory to place all our logic/code inside the try block

            /*
             * Any variable we declare inside the try block,
             * can only be accessed inside the { } of the try block
             */
            // we put all our code that might cause an exception:
            System.out.print("Enter your first whole number (the numerator): ");
            int n1 = input.nextInt();
            System.out.print("Enter your second whole number (the denominator): ");
            int n2 = input.nextInt();
            double div = n1 / n2;
            System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + div);

            // Finally our example for the array:
            String[] names = { "Alex", "Sam", "Kate", "Martin", "Sarah" };
            for (int index = 0; index < 6; index++) {
                System.out.println("Name: " + names[index]);
            }
        } catch (InputMismatchException e) {
            // InputMismatchException e =>
            // "e" variable is the object of type "InputMismatchException"
            // TO DO: handle exception
            // take the action when the exception is happened

            /*
             * using .getMessage() method of any Exception class
             */
            System.out.println(e.getMessage()); // null
            System.out.println("Invalid input! You need to enter a whole number only!");
        } catch (ArithmeticException e) {
            /*
             * java.lang.ArithmeticException => is already available (no need to import)
             * from the package "java.lang"
             */
            System.out.println(e.getMessage()); // / by zero
            System.out.println("Division by 0 is infinite!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // Index 5 out of bounds for length 5
        } catch (Exception e) {
            // Exception is the father of all the Java exception
            System.out.println(e.getClass()); // class name of the Exception
            // Example => class java.lang.ArrayIndexOutOfBoundsException
            System.out.println(e.getMessage());
        } finally {
            /*
             * The "finally" block:
             * - it's "Optional" (not required in our code)
             * - will always run (with exception or without)
             */
            System.out.println("Thank you, see you again");
        }

        // Review: Accessing the local variable "n1"
        // Error: n1 cannot be resolved to a variable
        // System.out.println("Your first number is: " + n1);

        // Closing the Scanner object:
        input.close();
        /*
         * Recap: We have examined 3 exceptions:
         * - java.lang.ArithmeticException/ by zero => only with integer values
         * - java.lang.ArrayIndexOutOfBoundsException
         * - java.util.InputMismatchException
         */
    } // main()
} // class
