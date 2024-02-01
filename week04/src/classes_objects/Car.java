/*
 * Java uses the keyword "package" to refer to a "folder"
 * In Windows/Mac => folders
 * In Java => packages
 * 
 * By convention, we use "snake_case" with naming our packages
 * (using the underscore _ between the words), example:
 * - school_info (better than schoolinfo, schoolInfo, SchoolInfo)
 * - club_registration 
 */
package classes_objects;
/*
 * In class can have two members:
 * -  1. Class Properties/Attributes/Class Fields:
 * -  2. Class Methods: functions declared inside a class
 */

public class Car {
    /*
     * 1. Class Properties/Attributes/Class Fields:
     * Variables declared inside a class
     */
    int year; // 2020
    String model; // SUV
    String type; // All wheel or front-wheel
    String color; // white or black

    /*
     * 2. Class Methods: functions declared inside a class
     * Functions => Represents actions
     */

    // Adding methods for "Car" not now :-(, but we will do it later :-)
    /*
     * But at least we do need to add the main() method
     * only if we want to run the "Car" class
     * otherwise:
     * Error: Main method not found in class classes_objects.Car,
     * please define the main method as:
     * public static void main(String[] args)
     * 
     * class "Car":
     * - An entry point to run our application => we must add main()
     * - As a Blueprint (Template) to create multiple object
     * 
     * We will NOT add the main() method,
     * we will use/call this class "Car" inside the class "CarDemo.java"
     */

} // class Car
