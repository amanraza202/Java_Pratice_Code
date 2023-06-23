import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i<=b; i++){
            if(i%11 == 0){
                continue;
            }
            else{
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
