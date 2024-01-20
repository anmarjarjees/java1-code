// Single Line Comment
/*
 * The "naming convention" for a class name:
 * 1. PascalCase => Capitalize every starting letter
 * Example => Datatype
 * 2. Using singular => Student (not Students) 
 */
// Hot Key: ALT+SHIFT+F => To format the code
public class DataType {
  public static void main(String[] args) {
    // all the code is written here for now...
    /*
     * We can store any value into a "variable"
     * which is a temporary container inside the RAM (Random Access Memory)
     * when we run our app.
     * Java: Strongly Typed Language (Any variable must have a data type)
     * 
     * General Data Type for any programming language:
     * > Text
     * > Numbers (Whole, Decimal)
     * > Boolean
     * > Objects
     * 
     * Creating our variables:
     * Two Different Syntaxes:
     * 1. Declare and initialize a variable:
     * DataType variableName = value;
     * 
     * 2. Declare a variable (no initialize)
     * DataType varName;
     * 
     * Data Types in Java are classified into two main categories:
     * - Primitive Types:
     * Examples: int, double, float, boolean
     * - Reference (Non-Primitive) Data Types => refer to objects
     * Examples: Strings, Arrays, Classes, Interfaces
     * 
     * - Primitive Types:
     * > boolean => true or false
     * 
     * > int ==> integer ==> 90, 87
     * int => Integer (whole number or Integral)
     * from -2,147,483,648 to 2,147,483,647
     * 
     * > double => decimal point
     * 
     * > float => Decimal Numbers
     * (Fractional Numbers/Floating point) 6 to 7 decimal digits)
     * 
     * > double => Decimal Numbers (Fractional Numbers/Floating point)
     * 15 decimal digits
     * 
     * > char => Characters (Single letter or one symbol or ASCII values)
     * value in single quotation mark
     * 
     * > byte => whole number (Integral) from -128 to 127
     * 
     * - Reference Types:
     * String
     * Array
     * Classes
     * Interfaces
     * 
     * A hint to differentiate between them :-)
     * - Primitive data types start with small letters
     * - Reference Data types start with Capital letters
     * 
     * For more details refer to this link
     * Link:
     * https://github.com/anmarjarjees/java-essentials/blob/main/Java-Essentials/src
     * /start/DataType.java
     * Link: https://www.w3schools.com/java/java_data_types.asp
     * Link:
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     */

    // Task: variable for storing a student age
    // "variable" a container for saving the student age:
    // By convention => camelCase
    // int => Integer (whole number or Integral)
    /*
     * Declare a variable of a type and assign an initial value"
     * DataType varName = initialValue; =>
     */
    int x = 23; // ???? what's "x" ???
    // instead of x, use a meaningful (descriptive) name
    int studentAge = 23; // Declare and initialize
    // int => primitive type

    // Task: variable for storing the number of subjects/courses:
    int courses = 5; // Declare and initialize

    Integer year = 2024;
    // Integer => reference type

    // Print the student age:
    System.out.println("studentAge"); // Wrong using "" with variable: studentAge

    // we can use print instead of println (to avoid adding a new line)
    System.out.print("Student's Age: "); // 23
    System.out.println(studentAge); // 23

    // Print the courses number:
    System.out.print("Number of courses for semester1: ");
    System.out.println(courses); // 5

    // Declare a variable for saving the name of student:
    String studentName; // Declare a variable only
    // NOTE: with String => we can only use double quotations
    studentName = "Alex Chow"; // Assign a value to the variable "studentName"

    // Task: variable for saving the student average:
    // "double" => Decimal Numbers (Fractional Numbers/Floating point)
    double average = 92.68; // average instead of using one char like "y"!!!
    // double => primitive type

    Double salary = 22.15;
    // Double => reference type

    // More examples:
    /*
     * Declare multiple variables of the SAME data type :-)
     * Declare Multiple Variables with "," (commas)
     * DataType varName1, varName2,...;
     */
    String collegeName, programName, collegeAddress;

    collegeName = "G@I";
    programName = "CMPG";
    collegeAddress = "120 Bloor St E.";

    // Try to avoid using all CAPS or small letters :-(
    String PROGRAM = "CMPG"; // CAPS
    String coursename = "Java"; // All small letters

    /*
     * Declare multiple variables of the SAME data type with initial values :-)
     * DataType varName1 = initialValue1, varName2 = initialValue2,... ;
     */
    double exam1 = 90.56, exam2 = 88.75, exam3 = 91.82;

    // More data types :-)
    // Two variables for saving the student initials:
    // Example: Alex Chow => First Initial is "A", and second one is "C"
    // NOTE: with char => we can only use one single quotation
    char firstInitial = 'A'; // using "char" for one character
    char secondInitial = 'C'; // we have to use ' instead "

    // True for "Yes" and False "No" => Boolean (Bool)
    // In Java, Boolean: either "true" or "false"
    // By convention, using isValid, isPassed, isCold,
    boolean isPassed = true;
    boolean isCold = false;

  } // main
} // class

/*
 * Java Variable Naming Conventions:
 * *********************************
 * - variables start with lowercase
 * - using camelCase with more than one word
 * - No spaces
 * - Cannot start with numbers
 * - no hyphens
 * - no reserved keywords
 * It's valid to use underscore _ => But it's mainly used with python
 * The underscore "_" is used with Java Packages (for later)
 */
