import java.util.regex.*;

public class example {
    public static void main(String[] args) {
        // String str ="Hello1";
        String str ="Hello1";
        // Pattern pattern = Pattern.compile("[a-zA-Z]+[0-9]");
        Pattern pattern = Pattern.compile("\\w+\\d");
        Matcher matcher = pattern.matcher(str);

        if(matcher.matches()){
            System.out.println("Pattern is Matches");
        }
        else{
            System.out.println("Pattern is not matches");
        }
    }
}
