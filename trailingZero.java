import java.util.Scanner;

public class trailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 0;
        int t_z = 0;
        if(num<5){
            System.out.println(t_z);
        }
        for(int i =5; num/i>=1; i= i*5){
            fact = fact + num/i;
            
        }
        System.out.println(fact);
        sc.close();
    }
}
