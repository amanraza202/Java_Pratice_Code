
public class stringPermutation {

    public static void main(String[] args) {
        String str = "abcad";
        int sum = 1;
        for(int i =str.length(); i>1; i--){
            sum = sum *i;
        }
        System.out.println(sum);
    }
}