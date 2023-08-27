import java.util.regex.*;

class regex {
    public static void main(String[] args) {
        // Pattern pattern = Pattern.compile("[abc]");// only abc Matches
        // Pattern pattern = Pattern.compile("[a-z]");// all a to z Matches only small alphabet
        // Pattern pattern = Pattern.compile("[0-9]");// all 0 to 9 Matches only small alphabet
        Pattern pattern = Pattern.compile("[^abc]");// Except abc Matches
        Matcher match = pattern.matcher("a");

        if (match.matches()) {
            System.out.println("Matches");
        } else {
            System.out.println("not Match");
        }

    }
}