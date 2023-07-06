class Node {
    Node next;
    int value;

    Node(int value) {
        this.value = value;
    }
}
class Queue{
    private Node first;
    private Node last;
    private int length;
    Queue(int value){
        Node newnode = new Node(value);
        first = newnode;
        last = newnode;
        length=1;
    }
    public void print(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        length++;
    }
    public void printFirst(){
        System.out.println("First: "+first.value);
    }
    public void printLast(){
        System.out.println("Last: "+last.value);
    }
}

public class queue {
    public static void main(String[] args) {
        Queue obj = new Queue(4);
        obj.print();
        obj.printFirst();
        obj.printLast();
    }

}