public class countApperence {
    public static void main(String[] args) {
        int arr[] = {5,6,5,1,5};
        int target = 7;
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("Occurence of "+target+" in this array is "+count);
    }
}
