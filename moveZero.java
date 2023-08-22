public class moveZero {
    public static void main(String[] args) {
        int arr[] = {0,5,0,4,3,2};
        int n = arr.length;
        for(int i =0; i<n; i++){
            boolean flag = false;
            for(int j = 0; j<n-1; j++){
                if( j<n && arr[j] == 0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    flag = true;
                }
            }
            if(flag==false){
                for(int val:arr){
                    System.out.print(val+" ");
                }
                break;
            }
            }
    }
}
