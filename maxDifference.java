import java.util.Arrays;

public class maxDifference {
    public static void main(String[] args){
        int arr[] = {1,5,6,10,2};


        Arrays.sort(arr);
        for(int i =0 ;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n"+(arr[arr.length-1]-arr[0]));
        // int max =0;
        // int min = arr[0];
        // for(int i =0; i<arr.length; i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        //     if(arr[i]<min){
        //         min = arr[i];
        //     }
        // }
        // int res =max-min;
        // System.out.println(min);
        // System.out.println(max);
        // System.out.println(res);



    }
}
