public class sortArrayInEvenOrOdd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int left = 0;
        int right = arr.length-1;
        System.out.println(arr[right]);
        while(left<right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left]%2 ==0){
                left++;
            }
            if(arr[right] %2 ==1){
                right--;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
