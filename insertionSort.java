public class insertionSort {
    public static void insertionSort(int arr[]){
        int n= arr.length;

        for(int i =1; i<n; i++){
            for(int j = i; j<n; j--){
                if( j>0 && arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,2,8,1,9};
        insertionSort(arr);

        for(int val:arr){
            System.out.print(val +" ");
        }
    }
}
 