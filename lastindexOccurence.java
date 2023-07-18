public class lastindexOccurence {
    public static void main(String[] args) {
        int arr[] = {5,5,2,3,5,9,10,5};
        int lastidx = 0;
        int target = 100;
        for(int i =0; i<arr.length; i++){
            if(arr[i] != target){
                lastidx = -1;
            }
            else if(arr[i] == target){
                lastidx = i;
            }
        }
        System.out.println(lastidx);
    }
}
