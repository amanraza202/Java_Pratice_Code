import java.util.regex.*;
public class dot {
    public static void main(String[] args) {
        String str = "12345789551 ABC";
        Pattern pattern = Pattern.compile("Welcome.");
        // Pattern pattern = Pattern.compile("\\d"); //accept all digit only
        // Pattern pattern = Pattern.compile("\\D"); //except digit all accept
        Matcher match = pattern.matcher(str);
        while(match.find()){
            System.out.print(str.substring(match.start(), match.end()));
        }
    }
}
