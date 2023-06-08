public class palindrome {
    public static void main(String[] args) {
        int n =221;
        int r,sum=0;
        int temp;
        temp = n;
        while(n>0){
            r= n%10;
            sum = sum*10 +r;
            n = n / 10;
        }
        if(temp == sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }


        String str = "abbbba";
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
