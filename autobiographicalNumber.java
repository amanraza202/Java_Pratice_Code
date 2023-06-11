/**
 * autobiographicalNumber
 */
public class autobiographicalNumber {

    public static void main(String[] args) {
        String str = "1210";
        char n[] = str.toCharArray();
        int arr[] = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[n[i] - '0']++;
        } 

        for (int i = 0; i < str.length(); i++) {
            if(arr[i] != n[i] - '0'){
                System.out.println("0");
            }
        }
    }       
}