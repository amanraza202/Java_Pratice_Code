// package StringBuilder;

public class convertuppertolowereandviceversa {
    public static void main(String[] args) {
        String str1 ="Physics";
        StringBuilder str = new StringBuilder(str1);
        for(int i =0; i<= str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch ==' '){
                continue;
            }
            int asci = (int)ch;
            Boolean flag = true;
            if(asci>=97){
                flag = false;
            }
            if(flag == true){
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
            else{
                asci -=32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }
}
