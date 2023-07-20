public class maximunArray {
    public static int maxArray(int arr[]){
        int max =0;
        if(arr.length == 1){
            return arr[0];
        }
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3};
        int max = maxArray(arr);
        System.out.println(max);
    }
}
