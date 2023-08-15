// package String;
import java.util.*;
public class replaceCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        System.out.print("Enter your index: ");
        int index = sc.nextInt();
        System.out.print("Enter your Character to replace: ");
        char ch = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder(str);
        for(int i =0; i<str.length(); i++){
            if(i == index){
              sb.setCharAt(index, ch);
            }
        }
        System.out.println(sb);
    }
}
