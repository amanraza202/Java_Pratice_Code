public class sortSquare {
    public static void main(String[] args) {
        int arr[] = {-10,-3,-2,1,4,5};
        int left =0;
        int right = arr.length-1;
        int ans[] = new int[arr.length];
        int i =0;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[i] = arr[left] * arr[left];
                i++;
                left++;
            }
            else{
                ans[i] = arr[right] * arr[right];
                i++;
                right--;
            }
        }
        for(int j = ans.length-1; j>=0; j--){
            System.out.print(ans[j]+" ");
        }
    }
}
