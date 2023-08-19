
public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {4,9,3,5,7,0,13,1};
        // int arr[] = {2,1,3,4,7,5};
        for(int i =0; i<arr.length; i++){
            boolean flag = false;
            for(int j = 0; j<(arr.length-1); j++){ //(arr.length-1)-i also work
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                // System.out.println(flag);
                break;
            }
        }

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    /*
     * Time Complexity
     * best O(N)
     * Worst O(N^2)
     * Average O(N^2)
     
     
     * Space Complexity
     * O(N)
     */
}