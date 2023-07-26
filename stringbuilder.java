// package StringBuilder;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append(" World");
        str.insert(1,"world");
        System.out.println(str);
        str.delete(1,6);
        System.out.println(str);
        str.setCharAt(0, 'd');
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
