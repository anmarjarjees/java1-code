package using_arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        // declare and initialize the array values in one line:
        String[] mySubjects = { "HTML", "CSS", "Bootstrap", "JavaScript", "jQuery", "Java", "Python" };

        // Task print all the array elements:

        // Bad way of coding :-(
        System.out.println(mySubjects[0]); // HTML
        System.out.println(mySubjects[1]); // CSS
        System.out.println(mySubjects[2]); // Bootstrap
        System.out.println(mySubjects[3]); // JavaScript

        /*
         * Based on this example:
         * mySubjects.length = 7 (7 elements)
         * 
         * Condition: index <= mySubjects.length
         * 7 <= 7 True
         */
        // Good way of coding :-)
        for (int index = 0; index < mySubjects.length; index++) {
            // access each element in the array to print it
            // printing the element of the current index
            System.out.println(mySubjects[index]);
        }

        /*
         * Exercise:
         * print the same array "subjects" using:
         * - While loop
         * - Do While loop
         */

    } // main
}
