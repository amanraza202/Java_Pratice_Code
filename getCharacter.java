// package String;
import java.util.Scanner;
class getCharacter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        String str = "GeeksForGeeks";
        
        for(int i =0; i<str.length(); i++){
           char ch = str.charAt(index);
           System.out.println(ch);
           break;

        }
        int idx = 5;
        StringBuilder sb = new StringBuilder("GeeksForGeeks");
        System.out.println(sb.charAt(idx));
    }
}