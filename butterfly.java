package pattern;

public class butterfly {
    public static void main(String[] args) {
        int n =4;
        for(int i =1; i<=n ; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =1; j<=(n-i)*2; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =1; i<=n; i++){
            for(int j =4; j>=i; j--){
                System.out.print("*");
            }
            for(int j=4; j>=2*(n-i);j--){
                System.out.print(" ");
            }
            for(int j =4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
