public class difference {
    public static void main(String[] args) {
        int arr[] = {12,3,14,56,77,13};
        int num = 13;
        int diff = 2;
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(Math.abs(arr[i]-num) <= diff){
                count++;
            }   
        }
        if(count == 0){
            System.out.println("-1");
        }
        System.out.println(count);
    }
}
