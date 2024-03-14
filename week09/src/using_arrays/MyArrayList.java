package using_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
        // Recap: Normal Array:
        String[] mySubjects = { "HTML", "CSS", "Bootstrap", "JavaScript", "jQuery", "Java", "Python" };

        // Create a new object of type "Scanner"
        Scanner sc = new Scanner(System.in);

        /*
         * Since Java 7, The symbol "<>" is used as part of the "Diamond Operator"
         * 
         * The diamond operator (<>) is used to specify a generic type
         * when we instantiate a generic class.
         * For example, consider a List of String:
         */

        // ArrayList:
        // Old way => ArrayList<String> myLanguages = new ArrayList<String>();

        // With the diamond operator, this can be simplified to:
        // 1: Declare an empty array list of "String" data types
        ArrayList<String> myLanguages = new ArrayList<>();

        // 2: Add values to this arraylist
        // myLanguages[0] = "HTML and CSS"; // Error...
        /*
         * myLanguages is an object of type "ArrayList":
         * object:
         * - properties => objectName.propertyName
         * - method => objectName.methodName()
         */

        // using .add() method of the ArrayList object "myLanguages":
        myLanguages.add("HTML and CSS"); // this will be in the first index (index 0)
        myLanguages.add("JavaScript"); // index 1
        myLanguages.add("PHP");
        myLanguages.add("Java");
        myLanguages.add("Python");

        // Task: Create ArrayList object "cars" of "String" data type
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Tesla"); // index 0
        cars.add("Toyota"); // index 1
        cars.add("Nissan"); // index 2
        cars.add("Dodge");
        cars.add("Ford");
        cars.add("Mazda");

        // Task output: My favourite car company is Toyota
        // cars[1] => with normal arrays!
        System.out.println("My favourite car company is " + cars.get(0));

        // print all the cars:
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        System.out.println(cars.get(3));

        /*
         * .length property is used with normal array
         * .size() method is used with arraylist
         */

        // for loop to print all the ArrayList elements:

        for (int index = 0; index < cars.size(); index++) {
            System.out.println(cars.get(index));
        }

    } // main()
} // class file
