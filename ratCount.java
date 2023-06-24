/**
 * ratCount
 */
// import java.util.Scanner;
public class ratCount {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int rat = 7;
        int unit = 12;
        int arr[] = {2 ,8, 3, 5, 7, 4, 1, 2};
        int food = rat * unit;
        int count =0;
        int sum =0;
        if(arr.length == 0){
            System.out.println("-1");
        }
        for(int i =0; i<arr.length; i++){
             sum +=arr[i];
             count++;
            if(sum>=food){
                System.out.println(count);
                break;
            }
        }
        if(sum<food){
            System.out.println("0");
        }

    }
}