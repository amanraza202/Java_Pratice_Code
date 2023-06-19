import java.util.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int arr[] = {5,2,4,3,9,7,1};
        Arrays.sort(arr);
        int check = arr[0]+ arr[1];
        int sum =4;
        int pro =0;
        if(check<sum){
            pro = arr[0] * arr[1];
        }
        System.out.println(pro);
     }
}