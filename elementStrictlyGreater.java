public class elementStrictlyGreater {

    public static void main(String[] args) {
        int arr[] = {1,5,8,1,0,15,7,8,9,5,6,2,4,8};
        int target = 7;
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>target){
                count++;
            }
        }
        System.out.println(count);

    }
}