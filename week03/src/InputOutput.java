// Don't forget the hotkey: ALT+SHIFT+F => to format your code :-)
/*
Class "Scanner":
- Scanner is a special data type that we need import in order to be able to use it
- The "Scanner class" is used to get user input, and it is found in the "java.util" package
- "java.util" is a "package", while Scanner is a class of the java.util package
 */

import java.util.Scanner;

public class InputOutput {
    // main() => Java default method
    public static void main(String[] args) {
        /*
         * Data types in Java:
         * > "Primitive" Data Type
         * > "Reference" Data types
         * 
         * Nice Tip:
         * Primitive types start with "small" letters
         * Ref. types start with "CAPITAL" letters
         * 
         * Q) Can we convert Pri to Ref data type or vice-versa?
         * A) We can only convert Pri. to Ref. type
         * by calling their "Wrapper Class"
         * Every Primitive Type has its own Wrapper Class:
         * double => Double
         * int => Integer
         * float => Float
         */

        // below are list of "local" variables
        // they are declared inside a method => local variables
        // To recap: camelCase naming convention
        String firstName = "Alex"; // declare a variable and initialize its value
        String lastName = "Chow"; // declare a variable and initialize its value
        double studentAverage = 88.73; // Hard Coding the value
        int age; // Declare a variable named "age" without initializing

        // Examples about using the Wrapper Classes:
        /*
         * Java Compiler will give us a waring about these two variables
         * because there are unused variables:
         */
        //
        Double price = 25.89;
        Integer year = 2024;
        /*
         * Wrapper Class:
         * int => Integer
         * double => Double
         * float => Float
         */

        // To recap:
        // Task output: Alex Chow has the average of 93.78
        // In any programming language, string value must be enclosed
        // using " (in Java/C#). " or ' in PHP, Python, JavaScript
        System.out.println("Alex Chow has the average of 93.78"); // (X)
        System.out.println('A');

        // Using the variables: firstName, lastName, studentAverage
        // Using the + symbol for concatenation

        // code below is fully functional (no errors)! Not well formatted in the output
        System.out.println(firstName + lastName + "has average of" + studentAverage);
        // Output: AlexChowhas average of88.73 <= not easy to read!

        // Adding a literal space between the first/last names
        // Adding space before/after the message " has the average of "
        System.out.println(firstName + " " + lastName + " has the average of " + studentAverage);

        System.out.print("Enter the new average value? ");
        /*
         * "Scanner" is Java built-in class is the tools that has operation to give us
         * the option to get an input from the console.
         * 
         * We have to import the "Scanner" first as we did above
         * The data type here is "Scanner"
         * 
         * Creating a "variable" named for example: "input"
         * to take user input with the Data type "Scanner" class
         * 
         * This variable "input" officially is called an "object" in OOP language
         * OOP => Object-Oriented Programming
         * 
         * Every variable in Java has a data type
         * the variable "input" is of type "Scanner"
         * "input" is an "object"
         * 
         * The concept of "Objects" and "Classes" will be covered in details later
         */
        Scanner input = new Scanner(System.in);

        /*
         * Using a method named "nextDouble()"
         * belongs to the objet "input"
         */
        double newAvg = input.nextDouble(); // .nextDouble()

        System.out.print("What is your name? ");
        String name = input.next();
        /*
         * .next() will only return what comes before the delimiter
         * (defaults to whitespace)
         * Example: if you enter "Java Programming" => only Java will be returned
         * 
         * .nextLine() will return the entire line
         * Example: if you enter "Learn Java Programming" => the entire line will be
         * returned
         * 
         * Link:
         * https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions
         * /Java-Scanner-User-Input-example-String-next-int-long-char
         */
        System.out.print("Please enter your age: ");
        // Notice that this variable "age" already declared
        age = input.nextInt();

        System.out.println(firstName + " " + lastName + " now, has the average of " + newAvg);

        System.out.println("Thank you " + name + " for inserting the information");
        System.out.println("Your age is " + age);
        // Link: https://www.w3schools.com/java/java_user_input.asp

        /*
         * NOTE:
         * When we create a Scanner object, we should close it at the end:
         * otherwise Java Compiler will show us this "warning" message,
         * when we hover the mouse over it:
         * "Resource leak: 'input' is never closed'"
         * 
         * Our Scanner object is called "input"
         */
        input.close();
    } // main()

} // class file
