package methods_more;

public class VariableScope {
    public static void main(String[] args) {
        /*
         * Variable Scope:
         * Variable can be accessed/used
         * within the block (scope) in which they were defined
         * 
         * The scope of the variable is inside the curly { } braces
         * in which it was defined
         */

        // Global Variable "currentLang" => Global Scope
        // it's declared outside any block (except the main)
        String currentLang = "Java";
        System.out.println("We are studying " + currentLang + " Language now.");

        // this if block will always run since it's true
        if (true) {
            // inside the if block:
            // "nextLang" variable has the Local Scope
            String nextLang = "PHP"; // also python :-)

            System.out.println("We are studying " + currentLang + " Language.");
        }

        // Error nextLang cannot be resolved to a variable
        // System.out.println("We will learn" + nextLang);

        // loop counter "i" has a local scope inside the for loop
        for (int i = 0; i < args.length; i++) {
            System.out.println(i);
        }

        // i cannot be resolved to a variable
        // System.out.println(i);

        // declare a global variable "count"
        int count;
        for (count = 0; count < args.length; count++) {
            System.out.println(count);
        }

        for (count = 0; count < args.length; count++) {
            System.out.println(count);
        }

        int x = 1;
        while (x < 11) {
            // do something
            int y = 5; // variable "y" has a local scope inside the while loop block
            System.out.println(y * x);
        }

        // Any code:

        do {

        } while (true);
    } // main()

    public void haveFun() {
        String text1 = "Have fun with Java!";
        /*
         * variable "text1" is declared locally inside the haveFun() method,
         * can only be accessed/used inside this method block
         */
        System.out.println(text1);
    }

    public void enjoyYourTime() {
        // text1 cannot be resolved to a variable
        // System.out.println(text1);
    }
}
