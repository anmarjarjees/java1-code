package oop_part1;

/* 
 * In OOP => A PIE
 * 
 * Class is a "blueprint" for object:
 * 
 * Create one "class" first,
 * then we create object(s) from a "class"
 * 
 * "Abstraction": 
 * - Place all the relevant info of a class inside the class itself
 * 
 * "Encapsulation":
 * - Hiding information of a class
 * 
 * NOTE:
 * Remember, we don't want to use this class "Car" to run our application
 * This will be used as a blueprint to create objects later...
 */
public class Car {
    /*
     * Any class can have 2 members:
     * 1- Class Fields/Properties/Attributes: Variables declared within (inside) a
     * class
     * 2- Behaviours => Methods => are "functions" to do actions
     * 
     * Class Methods: functions inside a class
     * 
     * Access (Visibility) Modifiers are applied to class members:
     * - public:
     * Can be accessed/used within or outside the class
     * 
     * - private:
     * Private to its class, can be accessed/used within the same class
     * itself
     * 
     * - protected:
     * Can be accessed by the subclasses only (in the next semester)
     * 
     * - If nothing is written (empty) => default
     * 
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */
    // Properties (attributes): Variables inside a class:
    /*
     * The best (recommended) coding practice to:
     * - Declare the class properties to be "private"
     * - Declare public methods to access them
     */
    public String brand; // Nissan, Toyota
    public String model; // cxt-9, ultra, ultimate
    private int year; // 2020, 2018 => cannot be accessed by the class object
    public String type; // SUV, Sedan, Truck
    private String color; // White,... => cannot be accessed by the class object

    // Methods (Behaviours):
    /*
     * same naming convention:
     * - camelCase (not PascalCase)
     * - start with english verbs
     * 
     * Generally speaking: methods are public
     */
    public void driveForward() {
        System.out.println("driving forward");
    }

    public void driveBackward() {
        System.out.println("driving backward");
    }

    public void turnLeft() {
        System.out.println("turn left");
    }

    public void turnRight() {
        System.out.println("turn right");
    }

    // Warning: The method stop() from the type Car is never used locally
    private void stop() {
        System.out.println("Stop now!");
    }
} // end class
/*
 * SUMMARY:
 * ********
 * "Access Modifiers" also called "Visibility Modifiers":
 * Access level modifiers determine whether other classes can use a particular
 * field or invoke a particular method.
 * - "private"
 * - "public"
 * - "protected"
 * - "default" if we don't specify
 * 
 * these modifiers can be added to properties and methods
 * The two members:
 * - Properties (Behaviours)
 * - Methods (functions inside a class)
 */
// we don't add any extra code...
