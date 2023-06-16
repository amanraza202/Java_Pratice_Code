public class inputOuput {
    public static void main(String[] args) {
        int n = 2;
        int m = 4;
        int notDiv_n = 0;
        int div_n = 0;
        int res = 0;
        for(int i =1 ;i<m; i++){
            if( i % n !=0){
                notDiv_n += i;
            }
            else{
                div_n +=i;
            }
        }
        res = Math.abs(notDiv_n - div_n);
        System.out.println(res);
    }
}
