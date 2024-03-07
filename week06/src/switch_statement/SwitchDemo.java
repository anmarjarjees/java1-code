package switch_statement;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * To recap: => two types of variables:
         * - primitive types: int, double, char, float
         * - reference types: Integer, Double, Char, Float, String
         */

        /*
         * In Java, when we compare two strings using the "==" operator,
         * we compare references, not the actual content of the strings.
         * 
         * NOTE:
         * If two string literals are the same,
         * Java Compiler optimizes and makes them refer to the same object in memory.
         * This is called "String Interning".
         */
        // Example:
        String title1 = "Programming";
        String title2 = "Programming";

        if (title1 == title2) {
            System.out.println("Same Title");
        } else {
            System.out.println("Not the same");
        }
        /*
         * Both variables "title1" and "title2"
         * are initialized with the same string literal "Programming".
         * Since string literals are "interned",
         * title1 and title2 end up referring to the same string object in memory.
         * That's why when we compare them using "==" operator,
         * it returns true, and "Same Title" gets printed.
         */

        /*
         * IMPORTANT NOTE:
         * ***************
         * When we use the "==" operator
         * to compare strings that are not string literals
         * but rather objects created at:
         * - using the "new" keyword (String myStr = new String("temp"))
         * - at runtime (e.g., from user input)
         * 
         * Even if they have the same content,
         * they will not necessarily refer to the same object in memory
         * Because we are comparing comparing the references of those objects,
         * not their content
         */
        String myStr = new String("test");

        // The "String" class represents character strings.

        System.out.print("What's your current programming language?");
        /*
         * NOTE:
         * The variable "language" below refers to a string object created at runtime.
         * we should never use the "=="" comparison as it will return false.
         */
        String language = sc.next();
        /*
         * Use may enter one the following:
         * - Java
         * - java
         * - JAVA
         * 
         * solution:
         * we should convert all the letters :
         * - either all in small => using the String method => toSmallCase()
         * - or all in capital => using the String method => toUpperCase()
         * 
         * Example, we will use toSmallCase() method:
         * - Java
         * - JAVA
         * - java
         * all be "java"
         */

        /*
         * Modifying the value of the same variable "language"
         */
        language = language.toLowerCase();

        /*
         * Using if condition with == to compare two strings could be tricky!
         * 
         * Remember that "String" is a class and the variable "language" is an object,
         * When we use "==" comparison operator with objects,
         * Java will compare the object references not its value
         * 
         * so this statement => if (language == "java") will be false :-(
         * but we can use a method of class "String" named equals():
         * template: string1.equals(string2)
         * 
         * Link: https://www.geeksforgeeks.org/compare-two-strings-in-java/
         * Link: https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
         * Link: https://www.baeldung.com/java-compare-strings
         * Link: https://opensource.com/article/19/9/compare-strings-java
         */

        System.out.println("\nIf Statement: "); // \n for a new line
        if (language.equals("java")) {
            System.out.println("in semester 1,2, and 3");
        } else if (language.equals("python") || language.equals("php")) {
            System.out.println("in semester 2");
        } else if (language.equals("javascript")) {
            System.out.println("in semester 3");
        } else {
            System.out.println("Invalid language");
        }

        // Converting the same if/else block logic to a switch statement:
        System.out.println("\nSwitch Statement: "); // \n for a new line
        /*
         * IMPORTANT NOTE:
         * "switch" in Java uses the .equals() method behind the scenes
         * to compare the value of the expression (language)
         * 
         * Java compares them using .equals(),
         * which compares the actual contents of the strings, not their references.
         * 
         * This behavior is different from using the "==" operator,
         * which compares object references.
         */
        switch (language) {
            case "java":
                // do my code...
                System.out.println("in semester 1,2, and 3");
                break;

            case "python":
                System.out.println("in semester 2");
                break;

            case "php":
                System.out.println("in semester 2");
                break;

            case "javascript":
                System.out.println("in semester 3");
                break;

            default:
                System.out.println("Invalid language");
                break;
        } // end of switch statement

        // copy the same switch block with simple modification:
        /*
         * since case "python" and case "php" both have the same identical code,
         * we can combine them:
         */
        switch (language) {
            case "java":
                // do my code...
                System.out.println("in semester 1,2, and 3");
                break;

            // combine the two cases
            case "python":
            case "php":
                System.out.println("in semester 2");
                break;

            case "javascript":
                System.out.println("in semester 3");
                break;

            default:
                System.out.println("Invalid language");
                break;
        } // end of switch statement

        sc.close();
    } // main()
} // class file
