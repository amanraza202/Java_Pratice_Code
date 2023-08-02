public class smallestLargest {
    public static int[] SmallestLargest(int arr[]){
        int max =0;
        int min = arr[0];
        
        for(int i =0; i<arr.length; i++){
            if(arr[i]<max){
                max = arr[i];
            }
            if(arr[i]>min){
                min = arr[i];
            }
        }
        int ans[] = {max,min};
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {1,8,100,50,-1,-50};
        int[] res = SmallestLargest(arr);
        for(int i =0; i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}
