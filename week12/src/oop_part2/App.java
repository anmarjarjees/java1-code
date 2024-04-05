package oop_part2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Using the same pattern:
         * ClassName objectName = new ClassName();
         */
        Car myCar = new Car();

        // Error: The field Car.brand is not visible
        // myCar.brand = "Toyota";

        // Java will not show us the class fields directly:
        myCar.setBrand("Dodge");
        myCar.setColor("white");

        System.out.println("My car is " + myCar.getBrand() + " and its color is " + myCar.getColor());
        // My car is Dodge and its color is white

        // Modify/Update:
        myCar.setBrand("Fiat");
        System.out.println("My car brand is :" + myCar.getBrand());

        System.out.println("What's your car brand?");
        Scanner sc = new Scanner(System.in);

        String userCar = sc.next();

        myCar.setBrand(userCar);
        System.out.println("Your car is :" + myCar.getBrand());

        sc.close();
    }
}
