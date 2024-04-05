package oop_part3;

/* 
 * We don't want to use this class to run our application,
 * We need to use it as a blueprint for creating objects
 * 
 * Class => Car
 * Objects of the class "Car"
 * - car1 of type Car => Toyota
 * - car2 of type Car => Mazda
 * - car3 of type Car => BMW
 * - we can as many object of this class...
 * 
 * Which means we don't add the main() method
 */
public class Car {
    // Properties, Attributes, Class field=> variables inside a class
    private String brand;
    private String model;
    private int year;
    private String type;
    private String color;

    /*
     * Every Class we create has a default constructor
     * Constructor: A "special" method to construct an object
     * Every class has "Built-in hidden default Constructor"
     * The default constructor has NO parameters
     * (Built-in default Constructor)
     * 
     * Important Note:
     * When we add a custom constructor with parameter(s) that accepts argument(s)
     * We cannot use the default one anymore :-(
     * Unless we explicitly write it or add it to our code :-)
     * 
     * The solution:
     * Just define/create this constructor: *
     */

    // Adding a custom constructor that can accept arguments
    /*
     * A "special" method:
     * - Has the same name as the class (Written in PascalCase)
     * - Has no return type (even no void)
     * 
     * For example, we picked only 4 properties:
     * 4 Arguments (passing 4 values): "Toyota","SUV","Rav4","Red"
     * 4 Parameters (4 variables to accept these values)
     * 
     * we can add as many as we need but with:
     * - different set parameters
     * - different data types
     */
    public Car(String carBrand, String carType, String model, String color) {
        /*
         * Using a custom constructor to initialize the class fields (properties)
         */
        // assign each value to its corresponding field:
        // Example:
        // the value of "brand" should be assigned to "brand" property
        // brand = "Toyota"
        // brand = brand; => has no effect (Wrong)

        // Solution#1: using different labels for the parameters
        brand = carBrand;
        // using "this" is this example is optional!
        this.type = carType;
        // Solution#2 (most commonly used):
        // by using the keyword "this."
        // using "this" is this example is mandatory
        this.model = model;
        this.color = color;
    }

    // Error: Duplicate method Car
    /*
     * public Car(String x, String y, String a, String b) {
     * }
     */

    // Yes, why not! let's add another constructor to initialize all the 5 class
    // fields:
    public Car(String carBrand, String carType, String model, int year, String color) {
        brand = carBrand;
        this.type = carType;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
} // class
/*
 * Note to consider:
 * *****************
 * Adding multiple constructor methods within the same class,
 * It's an example of "Polymorphism" of type "overloading"
 */