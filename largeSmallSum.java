import java.util.*;
public class largeSmallSum {

    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int arr[] = {3,2,1,7,5,4};
        if(arr.length<=3){
            System.out.println("0");
        }
        even.add(arr[0]);
        for(int i =1; i<arr.length; i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int ans = even.get(even.size()-2)+odd.get(odd.size()-2);
        System.out.println(ans);
    }
}