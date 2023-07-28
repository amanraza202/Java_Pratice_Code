public class targestSum {
    public static void main(String[] args) {
        int arr[] = {4,6,3,5,1,8,2,6};
        int target = 7;
        int count = 0;
        for(int i =0 ; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j] ==target){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
