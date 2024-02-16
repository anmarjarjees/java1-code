package switch_statement;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your current programming language? ");
        String language = sc.next();
        // The "String" class represents character strings.
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
         * Example, we will toSmallCase() method:
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

        // converting the same if/else block logic to a switch statement:
        System.out.println("\nSwitch Statement: "); // \n for a new line
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
