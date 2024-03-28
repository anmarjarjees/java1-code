package oop_part2;

// A PIE
/* 
 * A => Abstraction
 * P => Polymorphism (Multiple Forms):
 *  - Overloading (this semester - week11)
 *  - Overriding (next semester => Inheritance)
 * I => Inheritance
 * E => Encapsulation 
 */
public class Car {
    /*
     * Encapsulation:
     * It's recommended to encapsulate the class fields
     * by making them "private",
     * so we cannot immidialty/directly access them
     * 
     * Example: by making the class fields to be private
     */
    // Class Properties/Attributes/Fields: Usually all are private/protected
    // Variables inside a class:
    private String brand;
    private String model;
    private int year;
    private String type;
    private String color; // cannot be accessed by the class object

    /*
     * If the class fields are "private"
     * How to set their values?
     * How to get their values?
     * 
     * We use "public" 2 methods to access them,
     * By "convention", these 2 methods names start with:
     * - "get" to get their values
     * - "set" to set their values
     * Then add the field name (using camelCase)
     * 
     * That's why these two methods are:
     * - Getters
     * - Setters
     */

    // let's create a getter and a setter for each private field:

    // Getters => a method to get (return) a value of a class field

    // Getter for "brand" of type "String"
    public String getBrand() {
        return brand; // give us the brand value
    }

    // Getter for "color" field:
    public String getColor() {
        return color;
    }

    // Do the same for the others: model, year, and type (enjoy this task)

    // Setters: set a value to a class field:
    // We are assigning a value to a field not getting a value (no return)
    /*
     * By convention:
     * The method parameter usually has the same name as the class field:
     */
    public void setBrand(String brand) {
        // Warning: The assignment to variable brand has no effect
        // brand = brand;
        /*
         * the left-hand side "brand" => belongs to "this" class object (class field=>
         * brand)
         * the right-hand side "brand" => belongs to method parameter
         */

        this.brand = brand;
    }

    // one more example
    public void setColor(String c) {
        // for demo:
        color = c; // no need to use the keyword "this" => optional
    }

    // Enjoy completing the rest...
    // Class Methods: functions inside a class
    public void moveForward() {
        System.out.println("driving forward");
    }

    public void moveBackward() {
        System.out.println("driving backward");
    }

    public void turnLeft() {
        System.out.println("turn left");
    }

    public void turnRight() {
        System.out.println("turn right");
    }

}
