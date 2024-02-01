package wrong.example;
/*
 * Error Message will show at the begging:
 * 'The declared package "wrong.example" 
 * does not match the expected package ""'
 * 
 * Java is expecting to have two folders:
 * first folder "wrong" that contains the second one "example"
 * Because we used the dot symbol "." to name our package!!!
 * 
 */

public class BadExample {
    public static void main(String[] args) {
        System.out.println("Bad Example!");
    }
}
