public class findElement {
    public static void main(String[] args) {
        int arr[] ={1,2,8,9,7};
        int element = 19;
        int idx = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == element){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            System.out.println("Not Found");
        }
        else{

            System.out.println(idx);
        }
        
    }
}
