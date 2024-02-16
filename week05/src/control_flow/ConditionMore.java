package control_flow;

public class ConditionMore {
    public static void main(String[] args) {
        double studentAvg = 89.67; // hard coding the value

        // simple if/else block
        if (studentAvg >= 50) {
            // write my code if the condition is true:
            System.out.println("Good, you passed the module");
        } else {
            // write my code if the condition is false:
            System.out.println("Try again!");
        }

        /*
         * Simplify the if/else to "Ternary Operator":
         * if (condition)
         * {
         * condition is true => expression1
         * }
         * else {
         * condition is false => expression2
         * }
         * 
         * You just need one line of code: (condition) ? expression1 : expression2
         * expression1 => will run if it's true
         * expression2 => will run if it's false
         */

        // one line to combine the 4 lines of if/else block:
        System.out.println((studentAvg >= 50) ? "Good Job" : "Try again!");

        // Another Example:
        // Or assign the result to a variable:
        int age = 22;
        String msg = (age >= 18) ? "He/She can buy fireworks" : "He/She can't buy fireworks";
        System.out.println(msg);

    }
}
