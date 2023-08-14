// package String;
import java.util.ArrayList;
import java.util.Scanner;
public class printSubString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        ArrayList<String> substring = new ArrayList<>();
        for(int i =0; i<str.length(); i++){
            for(int j =i+1; j<=str.length(); j++){
                substring.add(str.substring(i,j));
            }
        }
        System.out.println(substring);
    }
}
