public class jumpGame {
    public static void main(String[] args) {
        int n = 10;
        int count =0;
        while(n > 0){
            if(n% 2!=0){
                n++;
                count++;
            }
            n = n/2;
            count++;
            n--;
        }
        System.out.println(count);
    }
}
