package control_flow;

public class LogicalOperator {
    public static void main(String[] args) {
        /*
         * In Java, we have the following 3 keywords and are called:
         * "Logical Operator"
         * - AND ==> &&
         * - OR ==> ||
         * - NOT ==> !
         * 
         * They are used to combine two conditions to result in a single Boolean value.
         */

        // TPL:
        /*
         * 3 Conditions:
         * - Live in Toronto
         * - Work in Toronto
         * - Study in Toronto
         * 
         * If (live in T OR work in T OR Study in T) {
         * can have the library card
         * } else {
         * cannot have the library card
         * }
         */

        // hard coding the values
        boolean liveInT = false;
        boolean workInT = true;
        boolean studyInT = false;

        if (liveInT || workInT || studyInT) {
            System.out.println("You can have a library card!");
        } else {
            System.out.println("You cannot have a library card!");
        }

        // the not operator !
        int age = 18; // Using the same integer variable "age" but with a new value
        // Here is the simple solution using our classical way:
        // if (age is greater than or equal to 18)
        if (age >= 18) {
            System.out.println("Yes, you can buy fireworks");
        }

        // So let's try to repeat the same example using the "NOT" Logical Operator, the
        // symbol is: !
        // more example: ! (not)
        // the NOT operation !
        // if (age is NOT less than 18)
        // In Java => !(our_condition) => if (!(age < 18)) then...
        // In JavScript => !our_condition => if (!age < 18) then...
        if (!(age < 18)) {
            System.out.println("Yes, you can buy fireworks");
        }

        // AND = OR => Combining two or more conditions into one
        /*
         * AND => Both/All conditions have to be "TRUE" to continue...
         * if the very first condition is "False", Java will ignore the rest
         * No need to evaluate the next/rest of the condition
         * False && ..Whatever is True/False.. => is always "False"
         * Example:
         * False && False = False
         * False && True = False
         * 
         * Analyze this simple logic:
         * if (5 >= 7 && 2<4)
         * > The first condition 5>=7 is false.
         * > Since AND "&&"" operator requires both/all conditions to be true,
         * > the second condition does not need to be evaluated because it will not
         * change the result
         * 
         * OR => At least one condition has to be "TRUE" to continue...
         * if the very first condition is "True", Java will ignore the rest
         * No need to evaluate the next/rest of the condition
         * True || ..Whatever is True/False.. => is always "True"
         * Example:
         * True && True = True
         * True && False = True
         */

    }
}
