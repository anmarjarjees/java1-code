package using_methods;

public class MethodsDemo {
    /*
     * "main" is a java method
     * to start our application
     * to run the current class file
     * 
     * it has the keyword "static"
     * 
     * "static" => this class member (property/method) belongs the class itself
     * (not the object)
     * In other words, we can access/call/use this method by the class name
     * not by the object of that class.
     * 
     * For more clarification look at the method example of getAreaCircle()
     */
    public static void main(String[] args) {
        /*
         * To recap:
         * when declaring a variable,
         * we must specify the data type.
         * 
         * Also with methods, any method we declare,
         * we must specify the return data type of that method,
         * they are the same data type for the variables.
         * 
         * Even if the method has no return,
         * we must specify "void"
         */
        int x = 10;
        double y = 70;
        float z = 80.89f;
        boolean isValid = true;
        double price = 78.67;
        String name = "Sam";
        double average = 90;

        /*
         * Using the average formula 4 times!
         * we can create one method to solve this formula
         * and just call this method 4 times instead :-)
         */
        double avg1 = (90 + 92) / 2;
        System.out.println(avg1);
        double avg2 = (80 + 82) / 2;
        double avg3 = (89 + 78) / 2;
        double avg4 = (92 + 88) / 2;
        System.out.println(avg2 + " " + avg3 + " " + avg4);

        /*
         * NOTE:
         * - We CANNOT build/create our methods inside the main() method!
         * - We can ONLY call/invoke/use/access our methods inside the main() method!
         */

        // Step2: calling our methods below:
        /*
         * Error: Cannot make a static reference to the non-static method
         * Solution: We have to make our methods "static" also like the main() method
         * because the main() method is "static"
         */
        // "arguments" => are the real value that we are passing to the method
        // parameters
        /*
         * Two keywords:
         * - Parameters: "num1" and "num2" are "parameters"
         * - Arguments: the value 90 and 80 are "arguments"
         * 
         * in other words:
         * arguments are the values for the parameters
         */
        getAverage(97, 80); // no output (we cannot see output)

        // getAverage() will return the result to the println()
        System.out.println("Average: " + getAverage(89, 91)); // 90.0

        getCircleArea(5); // no output (we cannot see output)
        System.out.println(getCircleArea(7)); // 153.86

        sayHello("Alex"); // it has an output => println
        sayHello("Sam");
    } // end main() method

    // we are going to add some custom methods (our methods):
    // after/before main (but NOT inside the main)
    // we can add our own functions => methods

    /*
     * method => a function => to do an action
     * By "convention", method names start with action verbs:
     * Examples:
     * - getAverage()
     * - deleteRecord()
     * - addStudent()
     * - driveForward()
     * - putItems()
     * - checkUserAge()
     * - ... so on ...
     * 
     * Methods can return values,
     * Java needs to know the return data type of these values:
     */

    /*
     * Create a new method to find the average of 2 numeric values:
     * Example:
     * num1= 78
     * num2 = 90
     * average = (num1+num2)/2
     * return the value of "average"
     */

    // Return type for the method is missing
    // This method must "return" a result of type double
    /*
     * Our method "getAverage" needs two numeric values (variables)
     * we can pass the needed values (variables) in between the ()
     * () => may contain a list of variables to be used inside the method body:
     * 
     * () => Parentheses
     * {} => Curly Braces
     * [] => Square Brackets
     * 
     * The variable(s) that we list in the method declaration: "parameters"
     * getAverage() method has two parameters: num1 and num2
     * > "parameters" => are just local variable(s) belong to the method,
     * are declared inside the () of the method signature
     * 
     * > "parameters" acting as placeholders for the upcoming values
     * when we call our method
     * 
     * We can also have local variables inside the method body { }
     * They have a local "scope" => can be accessed within the method
     * 
     * In Java, we have 3 major keywords:
     * "Access Modifiers" or "Visibility Modifiers":
     * - *public
     * - *private
     * - *protected
     * - default (when we leave it without specifying - rarely used)
     * NOTE: to be covered in details later...
     * 
     * Yes, in this example,
     * it works with any access modifier:
     * "public", "private", "protected", or just empty
     * 
     * But still good to make these method "public":
     * "public" this method can be accessed:
     * > within the class itself
     * > or outside the class
     */
    // Step1: Create/Design the method
    public static double getAverage(double num1, double num2) {
        // method block in between { and }
        // we write the method code...
        // the method task:
        double average = (num1 + num2) / 2;
        return average;
        /*
         * the "return" statement has two actions:
         * - return a value
         * - terminate the method (stop): we cannot put any code after this statement
         */
        // int test = 10; // Error: Unreachable code
    } // end getAverage() method

    /*
     * Add a simple method to "print":
     * hello any name => Hello Alex or Hello Sam
     * 
     * this will just print "Hello" with any name...
     * 
     * The keyword "void => this method has NO return type
     */
    // Step1: Create/Design the method
    public static void sayHello(String name) {
        // write the method task/job in between { }
        System.out.println("Hello " + name);
        // doesn't need a "return" statement
        // no value to return
    } // end sayHello() method

    /*
     * Task:
     * Create a method to find the "area" of any circle
     * Math Formula => Area = Pi * (radius * radius)
     * Ask yourself:
     * > print the result => just print the area within the method
     * (no need for return statement)
     * 
     * > get/receive the result => need to return the area
     * (a need for return statement)
     */
    // Step1: Create/Design the method
    public static double getCircleArea(double radius) {
        // Pi value is approximately 3.14
        // Using a simple math:
        double area = 3.14 * (radius * radius);

        // Or using the Java Math:
        /*
         * In Java, we can use the "Math" class to:
         * - get the value of PI
         * - the power of any number
         */
        // The class "Math" contains methods for performing basic numeric operations
        // pow() Returns:
        // the value of the first argument raised to the power of the second argument.
        double area2 = Math.PI * Math.pow(radius, 2);
        // Warning: The value of the local variable area2 is not used
        /*
         * We used/invoked the static "Math" class static members by their class name:
         * - the property "PI" => Math.PI
         * - the method "pow()" => Math.pow()
         */
        return area;
    } // end getCircleArea() method

    /*
     * Finally we can recreate:
     * > the same method
     * > with the same name
     * inside the same class
     * 
     * But it MUST have:
     * > either different set of parameters
     * > or different data types of parameters
     * 
     * In OOP it's called "Polymorphism" of type "Overloading"
     * This topic will be discussed in details later...
     * 
     * Look at the example below, the same method:
     * > public static double getAverage
     * > but it has 3 parameters instead of 2 parameters in the previous one
     */
    public static double getAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        return average;
    } // end getAverage() method

    /*
     * To recap:
     * In the code example of this file,
     * we can use any type access modifier:
     * > public
     * > private
     * > protected
     * > no specify <==> rarely used
     * 
     * But we used "public" to avoid leaving them "empty" without specifying
     * so it can be also used publicly outside this class
     */
}// class file
