package methods_more;

public class MethodsReview {
    /*
     * Recap:
     * We can write our custom methods
     * - before the main()
     * - after the main()
     * - NOT inside the main()!
     * - Inside the class
     */
    // we can write/list at the top of main()
    public static void main(String[] args) {
        // Call/invoke our methods:
        /*
         * Because we want to call our methods inside the the main(),
         * and the main() is "static",
         * we have to make our method static also
         */

        // double methods_review.MethodsReview.findAverage(double num1, double num2)
        findAverage(90, 91); // no output
        double avg1 = findAverage(20, 23);
        System.out.println("Average1 is " + avg1);

        System.out.println("Average2 is " + findAverage(90, 92));
        convertPoundToKilo(23); // no output

        /*
         * To recap:
         * The values we pass to the method's parameters
         * are called/named "Arguments"
         */
        printFullName("Alex", "Chow");

    } // main()

    // all your methods will be listed here:
    /*
     * step1: declare/create our methods outside the main(), inside the class
     * step2: call them inside the main()
     * 
     * AccessModifier ReturnDataType MethodName() {
     * 
     * }
     * 
     * Access Modifier (Visibility Modifier):
     * public => for level1
     * private => for level1
     * protected => for level2 (Inheritance)
     */

    /*
     * Task:
     * - Find the average of two numbers
     * - print or return? => returns the value of the average
     * 
     * An methods can have:
     * - input => the values that we have to pass to the method to work
     * - output
     * 
     * Conclusion:
     * - input => passing two numeric values
     * - output => returns the average
     */
    public static double findAverage(double num1, double num2) {
        // PEDMAS/BEDMAS
        double avg = (num1 + num2) / 2;
        // System.out.println(avg); // this method supposed to return the average
        return avg;
    }

    /*
     * Adding another custom method: Converting LB to KG:
     * - input: pass one numeric value "the value in LB"
     * - output: return the value in KG
     * Formula: for an approximate result, divide the mass value by 2.205
     */
    public static double convertPoundToKilo(double lb) {
        // we need to know the value in Pound?
        // take the value of the pound and make it in kilo
        // for an approximate result, divide the mass value by 2.205
        double kgValue = lb / 2.205;
        return kgValue;
    }

    /*
     * Task:
     * to create a method for printing/outputting the full name
     * after concatenating the first name with last name
     * this method has no return type => void
     * 
     * To recap:
     * the list of variables we pass to the function:
     * - String firstName
     * - String lastName
     * these variables are called/named "Parameters"
     * these parameters act as "placeholders"
     */
    public static void printFullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName); // Alex Chow
    }

    /*
     * We can have more than one method with the same name and the same return type:
     * But with two conditions:
     * - either with different set of parameters
     * - or with different data types of parameters
     * 
     * In Programming it's "Overloading"
     * In OOP => A PIE
     * P for "Polymorphism" which means "multiple forms".
     * "Overloading" is a type/kind of "Polymorphism"
     * No worries :-) this topic will be covered later
     * 
     * How many types/implementation of "Polymorphism" with methods?
     * - "Overloading" => for java level 1 (in this class file)
     * - "Overriding" => for java level 2 (for the coming topics)
     */

    // method for adding two numbers => returns the total
    public static double addNumbers(int num1, int num2) {
        /*
         * int total = num1+num2;
         * return total;
         */
        // we summarize the two lines into one
        return num1 + num2;
    }

    // Same method (different number of parameters) for adding 3 numbers
    public static double addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Same method (different data types of parameters) for adding 3 numbers
    public static double addNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

}
// class