public class countTriplet {
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,3};
        int target = 12;
        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                for(int z =j+1; z<arr.length; z++){
                    if(arr[i]+arr[j]+arr[z] == target){
                        
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[z]);
                    }
                }
            }
           
        }
    }
}
