import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int arr[] = {1,2,3,4,5}; 
        int n = arr.length;
        int ans[] = new int[n];
        int j =0;
        k = k%n;
        for(int i = n-k; i<n;i++){
            ans[j] = arr[i];
            j++;
        }
        for(int i = 0; i<n-k;i++){
            ans[j] = arr[i];
            j++;
        }
        for(int i =0 ;i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}
