// package String;

public class concatAndReverseString {
    public static void main(String[] args) {
        String str1 = "Geeks";
        String str2 = "forGeeks";
        String res = str1+str2;
        StringBuilder sb = new StringBuilder(res);
        sb.reverse();
        System.out.println(sb);

        int a = str1.codePointBefore(2);
        System.out.println(a);
    }
}
