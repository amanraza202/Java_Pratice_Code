// package String;

public class printEvenLengthWord {
    public static void main(String[] args) {
        String str[] = "This is a java".split(" ");
        for (String word : str) {
            if(word.length()%2 ==0){
                System.out.println(word);
            }
        }

    }
}
