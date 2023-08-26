import java.util.regex.*;

public class mobileNUmberCheck {
    public static void main(String[] args) {
        String number = "723456789";
        Pattern pattern = Pattern.compile("[987]{1}\\d{9}");
        Matcher matcher = pattern.matcher(number);

        if(matcher.matches()){
            System.out.println("Number is valid");
        }
        else{
            System.out.println("Number is invalid");
        }
    }
}
