public class repearValue {
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,6,3,4};
        int val = -1;
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    val = 0;
                    System.out.println(arr[i]);                    
                }
            }
        }
        if(val ==-1){
            System.out.println(val);
        }
    }
}
