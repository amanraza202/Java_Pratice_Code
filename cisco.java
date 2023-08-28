
public class cisco {

    public static void main(String[] args){
        String str = "abdabcefghabc";
        String pattern = "abc";
        int first = 0;
        for(int i =0; i<=str.length(); i++){
            for(int j = i+1; j<str.length(); j++){
                if(str.substring(i, j).equals(pattern)){
                    first = str.indexOf(pattern,i);
                }
            }
        }
        System.out.println(first);
    }
}