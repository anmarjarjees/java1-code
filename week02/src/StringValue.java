/*
 * To recap:
 * - Any java file is a class => class FileName
 * - it's public by default (can be accessed anywhere in our project)
 * public class fileName
 * - Any Java project, must have at least one "method" (function)
 * function to make an action called "main"
 * - main method is the entry point to run our application
 * JVM uses this method to run our app. 
 * - NOT every java file (class) must have the main() method (later)
 */
// Hot Key: ALT+SHIFT+F => to format the code
public class StringValue {
    public static void main(String[] args) {
        // place your code...
        /*
         * Task: two variables for saving the student first name, other one for last
         * name
         * Text Value => String data type => remember that "String" with capital "S"
         */
        // we can name it "fName" or "firstName" or...
        String firstName = "Alex";
        // String => is only Reference type
        String lastName = "Chow";

        /*
         * Task:
         * print the label and its value in the same line
         * Example:
         * First Name: Alex
         * 
         * Solution#1: using print() instead of println()
         */

        // Task: output (print) the first name:
        // println() method => print then add a new line
        System.out.print("First Name: ");
        System.out.println(firstName); // Ok => Alex

        // task: print the last name
        System.out.print("Last Name: ");
        System.out.println(lastName); // Ok => Chow

        // a decimal numeric value
        double studentAverage = 93.78;

        // HOT KEY for System.out.println() => type "sout" then TAB
        System.out.print("Final Average: ");
        System.out.println(studentAverage);

        /*
         * Solution#2: better to use one print statement
         * by using "Concatenation" with the symbol of "+"
         */
        System.out.print("First Name: " + firstName);

        // System.out.println("First Name: + firstName"); // Wrong
        // First Name: firstName

        /*
         * Java has too many builtin tools (methods)
         * to help us achieve many tasks!
         * Example: We can use the String method called "toUpperCase()"
         * to change all the String letters (text) to be capital:
         */
        // task output the first name all in capital: ALEX
        System.out.println("first name: " + firstName.toUpperCase());

        // same with last name:
        // Task: print => Last Name: Chow
        // do it :-)
    }
}
