package static_keyword;

public class User {
    // Fields (attributes):
    // variables inside a class:
    /*
     * To recap:
     * declare the class fields to be "private"
     * to emphasis on the concept of OOP which is "Encapsulation"
     * 
     * NOTE:
     * if we don't assign values to "class fields",
     * Java will assign default value for each data type
     */
    private String name; // null by default
    private int age; // 0 by default

    // Practicing the keyword "static"
    // this will make appName belongs to the "User" class itself
    // and also make userId belongs to the "User" class itself
    private static String appName; // application name
    private static int userId; // User ID
    private static int totalUsers; // Total number of users

    // 2 Constructors:

    // has two parameters => String name, int age
    public User(String name, int userAge) {
        this.name = name;
        // Or...
        age = userAge;
    }

    // has no parameters (recreate the default one) if needed:
    public User() {
    }

    // TASK: Add the getters and setters for the class fields to clear the warnings!

    // Methods:
    // Methods: are just functions inside a class:
    // this method is "public" => can be accessed outside the class "User"
    public void greetAll() {
        System.out.println("Hello every one! My name is " + this.name + " and I will work with you on Java!");
        // or without .this works also:
        System.out.println("Hello every one! My name again is " + name + " and I'm " + age + " years old.");
    }

    /*
     * More about "static" keyword:
     * The keyword "static":
     * - can be applied/added to any class member (field or method)
     * - this member can only be accessed through the class name (not the object)
     */

    // Example1: Create a method to be "static":
    // psvm => public static void main => we have to follow the same order
    public static void hiAll() {
        System.out.println("Hello every one! Do you like Java?");
    }

} // class
