public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {7,5,4,1,3};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i ;
            // int max_index = i ;
            for(int j = i+1; j<n ; j++){
                // if(arr[j]>arr[max_index]){
                    // max_index = j;
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            // arr[i] = arr[max_index];
            // arr[max_index] = temp;
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
