public class sumOfArray {
    public static int sumArray(int arr[]){
        int len = arr.length;
        int sum =0;
        for(int i =0; i<len;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3};
        int sum = sumArray(arr);
        System.out.println(sum);
    }
}
