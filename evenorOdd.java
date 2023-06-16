public class evenorOdd {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        while(n!=0){
            if(n % 2 != 0){
                n--;
            }
            else{
                n = n /2;
            }
            count++;
        }
        System.out.println(count);
    }
}
