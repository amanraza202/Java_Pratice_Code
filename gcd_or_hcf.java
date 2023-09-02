// package revision;

public class gcd_or_hcf {
    public static void main(String[] args) {
        int a =47; int b = 91;int gcd =1;
        for(int i =1; i<=a && i<=b; i++){
            if(a%i ==0 && b%i ==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
