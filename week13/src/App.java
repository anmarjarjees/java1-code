/* 
 * IMPORTANT NOTE:
 * *****
 * Notice that this class "App.java"
 * is inside the the source project folder "src"
 * 
 * Not inside the package/folder "oop_part3"
 * the class "Car.java" is inside the package/folder "oop_part3"
 * 
 * Both "App.java" and "Car.java" are inside the same project "week13"
 * 
 * Instead of moving the main file "App.java"
 * inside the package "oop_part3" to directly access "Car.java",
 * We can just import the class "Car.java" to this location!
 * by using "import" statement
 */

/*  
 * If we don't import the class "Car" from the package "oop_part3"
 * The type "Car" will be undefined:
 * Error: Car cannot be resolved to a type
 * 
 * Fix => using the import statement:
*/
import oop_part3.Car;

/* 
 * If you have multiple classes,
 * and you want to import them all
 * we can simply just use the wiled card! => *
 * 
 * the symbol "*" => means all the classes
 */
// import oop_part3.*;

public class App {
    /*
     * We do need to add the main() method here
     * to start our application
     */
    public static void main(String[] args) {
        // create an object/instance of type "Car":
        // Task1: Create an object of type Car:
        /*
         * Error: Car cannot be resolved to a type
         * Java Compiler cannot see/access the class "Car"
         * If we don't import it first!
         * Because it's declared in a separate folder/package
         */
        Car car1 = new Car(); // create an empty object

        // Task: myCar.brand="Dodge";
        // how to set the value of "Dodge" to the brand of car1:
        // using the method setBrand()
        car1.setBrand("Dodge");
        car1.setModel("CX-120");
        car1.setColor("white");
        car1.setType("SUV");

        // Question:
        // *********
        // Cannot we pass all the necessary value when we create an object
        // or when we construct an object?
        // The constructor Car(String, String, String, String) is undefined
        Car car2 = new Car("Toyota", "SUV", "Rav4", "Red");
    } // main()
} // class
