import java.util.Scanner;

public class rotateArrayWithoutUsingNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        k = k%n;
        for(int i = n-k; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i =0; i<n-k; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
