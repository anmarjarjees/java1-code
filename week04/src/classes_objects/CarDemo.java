package classes_objects;

public class CarDemo {
    // We have to use the main():
    public static void main(String[] args) {
        // Create an object from the class "Car"
        /*
         * We will create 3 objects from the class "Car"
         * - myCar
         * - myFriendCar
         * - myCousinCar
         */

        // create a variable "myCar" as an object from "Car"
        // is an object of type "???"
        Car myCar = new Car();

        // myFriendCar:
        Car myFriendCar = new Car();

        // myCousinCar:
        Car myCousinCar = new Car();

        // mySecondCar:
        /*
         * It would be much useful to pass these information
         * to our object(s):
         * 2010,"SUV","Nissan","White"
         * 
         * But we cannot do it now?
         * Reason:
         * Because we don't the "constructor" inside our class "Car"
         * to accept these information "arguments"
         * 
         * Q) How can we add/create this "constructor" inside our class "Car" ?
         * A) Don't worry, we will do later :-)
         */
        // Car mySecondCar = new Car(2010, "SUV", "Nissan", "White");
        // Error: The constructor Car(int, String, String, String) is undefined

        System.out.println("myCar" + myCar);
        // myCarclasses_objects.Car@36baf30c

        System.out.println("myFriendCar" + myFriendCar);
        // myFriendCarclasses_objects.Car@23fc625e

        System.out.println("myCousinCar" + myCousinCar);
        // myCousinCarclasses_objects.Car@3f99bd52
    }
}
