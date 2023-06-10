public class divisibleBy {
    public static void main(String[] args) {
        // int n =4;
        int m = 20;
        int sum_div_4 = 0;
        int sum_div_4_not =0;
        for(int i =1; i<=m; i++){
            if(i%4 == 0){
                sum_div_4 += i;
            }
            else{
                sum_div_4_not +=i;
            }
        }
        int ans = Math.abs(sum_div_4 - sum_div_4_not);
        System.out.println(ans);
    }
}
