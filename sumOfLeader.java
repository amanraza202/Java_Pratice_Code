public class sumOfLeader {
    public static void main(String[] args) {
        int arr[] ={25,66,64,36,45,24,32};
        int sum =0;
        for(int i =0; i<arr.length; i++){
            int j;
            for(j =i+1; j<arr.length; j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j == arr.length){
                sum += arr[i];
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("\n"+sum);
    }
}
