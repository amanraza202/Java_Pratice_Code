public class secondLargestnumber {
    public static void main(String[] args) {
        int arr[] = {9,8,5,6,4,7};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        for(int i =0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
            if(arr[i]>second){
                second = arr[i];
            }
        }
        
        System.out.println(second);
    }
}
