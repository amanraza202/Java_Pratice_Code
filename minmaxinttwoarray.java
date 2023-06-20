public class minmaxinttwoarray {
    public static void main(String[] args) {
        int arr1[] = {9,16,12,5,15};
        int arr2[] = {14,7,22,5,32,77};
        int max_count =0;
        int min_count =0;

        for(int i =0; i<arr1.length; i++){
            if(arr1[i]>9){
                max_count++;
            }
        }
        for(int i =0; i<arr2.length; i++){
            if(arr2[i]<9){
                min_count++;
            }
        }
        int res = Math.max(max_count,min_count);
        System.out.println(res);
    }
}
