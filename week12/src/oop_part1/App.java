package oop_part1;

/* 
 * the file "App.java" is not a blueprint
 * the file to start my application
 * it has the main()
 */
public class App {
    public static void main(String[] args) {
        // write our code to create multiple cars from "Car" class
        // the time to create our object(s):
        /*
         * Task: create the first car object
         */

        // to recap:
        // DataType variableName = initialValue;
        // Example => int x = 1;

        /*
         * To recap:
         * Scanner sc = new Scanner(System.in)
         */

        // car1 as an object of type "Car"
        Car car1 = new Car();

        // make another one:
        Car car2 = new Car();

        // Keep going...
        Car car3 = new Car();

        /*
         * To access the class members (properties/methods):
         * > objectName.propertyName
         * > objectName.methodName()
         */

        // task: give brand name for the car1:
        car1.brand = "Toyota";
        // set the value of "Toyota" to the object brand "car1"

        // model:
        car1.model = "SXP";
        car1.type = "SUV"; // set the value of "Supra" to the object'model "car1"

        System.out.println("The first car is " + car1.brand);

        System.out.println("My car is " + car1.brand + " and its model is " + car1.model);

        // The field Car.color is not visible
        // car1.color = "White";

        // The field Car.year is not visible
        // car1.year = 2020;

        // Error: The field Car.year is not visible
        // Answer: it was declared as "private"
        // car1.year = 2018;

        // access the class methods:
        // ErrorL driveForward cannot be resolved or is not a field
        // car1.driveForward;

        car1.driveForward();
        car1.driveBackward();

        // Error: The method stop() from the type Car is not visible
        // car1.stop();

        car1.turnLeft();
        car1.turnRight();

        // doing the same thing with the other 2 objects: car2 and car3...
        car2.brand = "Nissan";
        car3.brand = "Mazda";

        Car myCar = new Car();
        Car myFriendCar = new Car();

        myCar.driveForward();
        myFriendCar.driveBackward();
    } // main()
} // class
