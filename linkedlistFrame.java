import java.util.LinkedList;
public class linkedlistFrame {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.addLast("List");
        obj.addFirst("a");
        obj.addFirst("is");
        obj.addFirst("This");
        // System.out.println(obj);
        obj.removeLast();
        obj.removeFirst();
        for (int i = 0; i <obj.size() ; i++) {
            System.out.print(obj.get(i)+"->");
        }
        System.out.println("NULL");
    }
}
