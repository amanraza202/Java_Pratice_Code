public class arraySortorNot {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,7,9,10};
        boolean res = true;
        for(int i =1; i<arr.length; i++){
            if(arr[i-1]<arr[i]){
                res = true;
            }
            else{
                res = false;
            }
        }
        if(res){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }
    }
}
