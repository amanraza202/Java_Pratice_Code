public class passwordValidation {
    public static int password(String str){
        char ch[] = str.toCharArray();
        boolean num = false;
        boolean cap = false;
        if(str.length()<4){
            return 0;
        }
        if(ch[0] >= 48 && ch[0] <=57){
            return 0;
        }
        for(int i =0; i<ch.length; i++){
            if(ch[i] == ' ' || ch[i] =='/'){
                return 0;
            }
            else if(ch[i]>=65 && ch[i]<=90){
                cap = true;
            }
            else if(ch[i]>=48 && ch[i]<=57){
                num = true;
            }
        }
        boolean res = cap && num;
        if(!res){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        String str = "abc123@A";
        int ans = password(str);
        System.out.println(ans);
    }
}
