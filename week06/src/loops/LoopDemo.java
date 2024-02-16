package loops;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        // Task: printing from 1 to 10:
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        // and so on till 10!!! repeat the same code 10 times:
        /*
         * 3 Main Types of loops:
         * - for (for i) loop for now [for i and foreach]
         * - while loop
         * - do while loop
         * 
         * 3 required sections for the listed loop:
         * 1- initialize the loop counter (starting the point)
         * 2- the condition to keep looping (the number of times to keep looping)
         * 3- increment/decrement the loop counter
         * 
         * NOTE: loop counter is an integer variable with any name
         * we can name it "i" for iteration or any other name
         */

        // condition=> i<=10 OR i<11
        // Increment=> i = i + 1 better to use i++
        for (int i = 1; i <= 10; i = i + 1) {
            // this statement will be printed 10 times:
            System.out.println(i);
        }

        // Task: Print "Even" numbers from 0 to 20:
        // Complex solution :-(
        for (int index = 0; index < 21; index++) {
            /*
             * Check if the number is even => then print
             * In Math,
             * we can divide the number by 2 => check the remainder
             * if the he remainder = 0 => this number is even
             * index is even =>
             */
            if (index % 2 == 0) {
                System.out.println(index);
            }
        }

        // Simple solution :-)
        for (int index = 0; index < 21; index += 2) {
            System.out.println(index);
        }

        // Odd numbers => same logic but starts with 1 (not 0)
        // Task: printing from 10 to 1: 10,9,8,7, ....1 (0 or negative numbers NOT)
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("\nWhile:");
        // Convert the for loop to while: 1 to 10
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        System.out.println("\nDoWhile:");
        // Task: printing from 10 to 1
        int num = 10;
        do {
            // my code...
            System.out.println(num);
            // Decrement operator
            num--; // 10 - 9 - 8 ... 1 - 0 -1 -2 -3 -4
        } while (num > 0);

        /*
         * While loop will check first then does the loop after
         * Do While loop will do the loop at least for one iteration, then check after
         * 
         * In other words, do while will run at least one time
         * even if the condition is false
         */
        int value = 12;
        do {
            System.out.println("Value do: " + value);
            value--;
        } while (value < 10); // 12 < 10 => false

        // Simple Game to practice the doWhile loop:
        Scanner sc = new Scanner(System.in);
        boolean tryAgain = true;
        int luckyNumber = 8; // hard coding the number, good to use random (later)
        do {
            System.out.print("Guess the lucky number between 1 and 10: ");
            int userNumber = sc.nextInt();
            if (userNumber == luckyNumber) {
                System.out.println("Good Job!");
                tryAgain = false;
            } else {
                System.out.println("Try again");
            }
        } while (tryAgain); // the loop stops when tryAgain is "false"

        // The keywords: "continue" and "break":
        /*
         * for loop / while / do while can have/use these 2 keywords:
         * - break
         * - continue
         */

        // "break" Example:
        num = 20; // reset the value to 1
        int i; // we can declare the loop counter outside
        for (i = 0; i < num; i++) {
            // we need to break the loop if the num is greater than 20:
            if (num >= 10) {
                // stop my loop!
                break; // stop the loop
            }
            System.out.println("Current count value: " + num);
        }

        // "continue" Example:
        /*
         * the keyword "continue":
         * Task using for loop and while loop
         * to print odd numbers with "continue":
         */

        /*
         * % => Modulo operator => the remainder of division
         * number % 2 = if the remainder 0 => Even
         * number % 2 = if the remainder 1 => Odd
         */

        // with while:
        i = 1;
        while (i < 20) {
            if (i % 2 == 0) {
                /*
                 * "continue" will skip or stop the current iteration
                 * and will move to the next one
                 */
                i++;
                /*
                 * NOTE:
                 * we need to increment the "i" inside the if condition
                 * beside the original one outside the if condition
                 * Otherwise, the loop will stuck here!
                 */
                continue; // skip the rest of the code in while loop
            }
            System.out.println(i); // 1
            i++; // we need to increment the outside the if condition
        } // while

        // with for loop:
        for (i = 1; i < 20; i++) {
            // try it...
        }

        System.out.println("\nAnother way:"); // adding \n for a new line :-)
        // Other solution to only write one increment statement!
        // Jose: By using only one increment at the top
        // with while:
        i = 0;
        while (i < 20) {
            i++; // nice and good idea of putting the increment here :-)
            if (i % 2 == 0) {
                continue; // skip the rest of the code in while loop
            }
            System.out.println(i); // 1
        }

        // finally, closing the scanner:
        sc.close();
    } // main()
} // class file
