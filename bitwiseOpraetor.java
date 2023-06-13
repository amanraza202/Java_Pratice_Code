public class bitwiseOpraetor {
    public static char AND(char a, char b){
        if(a==1 && b == 1){
            return '1';
        }
        return '0';
    }
    public static char OR(char a, char b){
        if(a==0 || b == 0){
            return '0';
        }
        return '1';
    }
    public static char XOR(char a, char b){
        if(a==b){
            return '1';
        }
        return '0';
    }
    public static void main(String[] args) {
        String str = "1C0C1C1A0AB1";
        char ch[] = str.toCharArray();
        char res1 = ch[0];

        for (int i = 1; i < str.length(); i++) {
            char op = ch[i];
            char res2 = ch[i+1];

            if(op == 'A'){
                res1 = AND(res1, res2);
            }
            else if(op == 'B'){
                res1 =OR(res1, res2);
            }
            else if (op == 'C'){
                res1 = XOR(res1, res2);
            }
        }
        System.out.println(res1);
    }
}
