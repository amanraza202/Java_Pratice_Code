// package String;

public class stringIntoAnotherString {
    public static void main(String[] args){
        String str = "GeeksGeeks";
        int idx = 4;
        String insert = "for";
        String half ="";
        String rem = "";
    for(int i =0; i<str.length(); i++){
        if(i == idx){
            half = str.substring(0, idx+1);
            rem = str.substring(idx+1,str.length());
            
        }
    }
    System.out.println(half + insert + rem);

    }
}
