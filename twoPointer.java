public class twoPointer {
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,0,1,1,0,1};
        int left =0;
        int right = arr.length-1;

        while(left<right){
            if(arr[left] == 1 && arr[right] ==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;           
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }

        //Method 2
        // int n = arr.length;
        // int count =0;
        // for(int i =0; i<n; i++){
        //     if(arr[i] == 0){
        //         count++;
        //     }
        // }
        // for(int i =0; i<n; i++){
        //     if(i<count){
        //         arr[i] = 0;
        //     }
        //     else{
        //         arr[i] = 1;
        //     }
        // }
        // for(int i =0 ;i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
}
