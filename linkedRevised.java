class Node{
    Node next;
    int value;
    Node(int value){
        this.value = value;
    }
}
class linkedlist{
    private Node head;
    private Node tail;
    private int length;
    linkedlist(int value){
        Node newnode = new Node(value);
            head = newnode;
            tail = newnode;
            length++;
        
    }
    public void printhead(){
        if(head == null){
            System.out.println("Head is null");
        }
        else{
            System.out.println("Head: "+head.value);
        }
    }
    public void printail(){
        if(tail == null){
            System.out.println("Tail is Empty");
        }else{
            System.out.println("Tail: "+tail.value);
        }
    }
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is Empty");
        }
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        length++;
    }
    public void insert(int value){
        if(head == null){
            System.out.println("LinkedList is empty");
        }
        else{
            Node newnode = new Node(value);
            tail.next = newnode;
            tail = newnode;
            length++;
        }
    }
    public void addstart(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            tail = newnode;
        }else{
            newnode.next = head;
            head = newnode;

        }
        length++;
    }
    public void deleteend(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            Node pre = head;
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
        }

    }
    public void deletestart(){
        if(head == null){
            System.out.println("List is Empty");
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }
}



public class linkedRevised {
    public static void main(String[] args) {
        linkedlist obj = new linkedlist(10);
        obj.addstart(0);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.deleteend();
        obj.deletestart();
        obj.printhead();
        obj.printail();
        obj.print();
    }
}
