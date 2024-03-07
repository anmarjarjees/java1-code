package using_arrays;

public class MyArray {
    public static void main(String[] args) {
        int myLuckyNumber = 7; // if I want to use one number

        // Question: What if we have 5 lucky numbers:
        int myLuckyNumber1 = 9;
        int myLuckyNumber2 = 3;
        int myLuckyNumber3 = 10;
        int myLuckyNumber4 = 25;
        int myLuckyNumber5 = 30;

        /*
         * Single variable to hold multiple values:
         * Java and C# has these two rules:
         * - The data types of the values (elements) inside the array
         * - How many elements we put in the array
         */
        int[] myChannels; // declare an empty array
        String[] employees; // declare an empty array

        // Using an array instead:
        int[] myLuckyNumbers = new int[5]; // array of 5 elements
        System.out.println(myLuckyNumbers); // [I@4617c264
        /*
         * Array Structure:
         * Element (value): 9 , 3 , 10 , 25 , 30 => 5 elements
         * Index: 0 , 1 , 2 , 3 , 4, , 5 => the highest index is 4
         * Index of the first element is 0
         * Index of the last element is "Array Length/Size" - 1
         */

        /*
         * Insert numbers into "myLuckyNumbers" array
         */
        myLuckyNumbers[0] = 9; // first element of the array => index of 0
        myLuckyNumbers[1] = 12; // second element of the array => index of 1
        // same for the rest...
        myLuckyNumbers[2] = 10;
        myLuckyNumbers[3] = 25;
        myLuckyNumbers[4] = 30;
        // myLuckyNumbers[5] = 35;
        /*
         * Error:
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
         * Index 5 out of bounds for length 5
         * at using_arrays.MyArray.main(MyArray.java:42)
         */

        // more examples :-)
        // Creating a String array to save students' names:
        String[] students = new String[6];

        // 6 students (6 elements so index 5 maximum)
        students[0] = "Alex Chow";
        students[1] = "Martin Smith";
        students[2] = "Sam Simpson";
        students[3] = "Sarah Grandson";
        students[4] = "Kate Wilson";
        students[5] = "Elena Chow";

        /*
         * How to print/output the array elements?
         */
        // testing again output the array "students"
        // example below is not useful:
        System.out.println(students); // [Ljava.lang.String;@36baf30c

        // print each element:
        // output/print only the first student:
        System.out.println(students[0]); // [0] => index of the "first student"
        // so on for the rest...
        System.out.println(students[1]); // second student
        System.out.println(students[2]); // third student
        System.out.println(students[3]); // forth student

        System.out.println("First Student: " + students[0]);

        // override any value:
        // Change the name of the "second" student "Martin Smith" with "James Dean"
        students[1] = "James Dean";

        // Initialize an new array:
        // declare a new array and assign values (elements) in the same line:
        // one line for creating and populating the array's values!
        // Example: Subjects Array:
        String[] subjects = { "HTML", "CSS", "Bootstrap", "JavaScript", "jQuery", "Python", "C#" };

        /*
         * Task: print the first element and the last element:
         */
        System.out.println("First Subject: " + subjects[0]);
        System.out.println("Last Subject: " + subjects[5]); // "hard coding" not always correct!

        /*
         * Recap "Classes and Objects" in a nutshell:
         * - Class is the blueprint (main template) of an object
         * - Object can be created from a class
         * 
         * Any "class" can have two members (things):
         * - Properties/Attributes/Class Fields
         * - Methods/Behaviours
         * 
         * Object is created from a class,
         * which means every object can have the same two things:
         * - Properties/Attributes/Class Fields
         * - Methods/Behaviours
         * 
         * "Array" structure in Java is also a "class" that has properties and methods
         */
        System.out.println("we have 6 subjects"); // 6 fixed number :-(
        System.out.println("we have " + subjects.length + " subjects"); // dynamic :-)

        // Printing the last item:
        int arrayLength = subjects.length;
        System.out.println("Last Subject: " + subjects[arrayLength - 1]);
        // Last Subject: C#
    } // main()
}
