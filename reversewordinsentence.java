
// package StringBuilder;
public class reversewordinsentence {

    public static void main(String[] args) {
        String str = "My name is Aman Raza";
        String ans ="";
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch !=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        ans += sb.reverse();
        System.out.println(ans);

    }
}