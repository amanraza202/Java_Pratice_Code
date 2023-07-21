import java.util.Scanner;

public class queryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Queries Number:");
        int n = sc.nextInt();
        int arr[] = {5,6,5,400,560,1000,400};

        int fre[] = new int[100005];
        for(int i =0; i<arr.length; i++){
            fre[arr[i]]++;
        }

        while(n>0){
            System.out.print("Enter your "+n+" number:");
            int x = sc.nextInt();
            if(fre[x]>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            n--;
        }
        sc.close();
    }
}
  