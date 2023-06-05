import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,500,6,7,-1,50};
        for(int i =0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                System.out.println("not sorted");
            }
            else{
                System.out.println("sorted");
            }
        }
    }
}
