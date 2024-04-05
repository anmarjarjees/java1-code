package static_keyword;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex Chow", 38);
        User user2 = new User();

        // user1.greetAll();

        user2.greetAll();

        /*
         * Warning:
         * The static method hiAll() from the type User
         * should be accessed in a static way
         * 
         * Q) How to access a static member (property/method) in a static way?
         * A) Using this template:
         * => ClassName.PropertyName
         * => ClassName.methodName()
         */
        // user2.hiAll();

        User.hiAll();

        // Hello every one! Do you like Java?
    }
}
