package methods_more;

// one more example about "Overloading"
public class OverloadedMethod {
    public static void main(String[] args) {
        // call the methods:
    } // main()

    // for self-reading :
    // Create our custom methods:
    public String getScore(int score) {
        if (score <= 50) {
            return "Low Score";
        } else if (score <= 70) {
            return "Moderate Score";
        } else if (score <= 100) {
            return "High Score";
        } else {
            return "Invalid Score!";
        }
    }

    public String getScore(double score) {
        return "anything";
    }

    // Second: passing => double score1, double score2
    public String getScore(double score1, double score2) {
        return "Nothing just testing Overloaded Methods again :-)";
    }

} // class
