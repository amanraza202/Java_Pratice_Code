class Node {
    Node next;
    int val;

    public Node(int val) {
        this.val = val;
    }
}

class ll {
    private Node head;
    private Node tail;
    int length;

    public ll(int value) {
        Node new_node = new Node(value);
        head = new_node;
        tail = new_node;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LinkedList is Empty");
        }
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }

    public void prinntHead() {
        if (head == null) {
            System.out.println("Head is Empty");
        } else {
            System.out.println("\nHead: " + head.val);
        }
    }

    public void prinntTail() {
        if (tail == null) {
            System.out.println("Tail is Empty");
        } else {
            System.out.println("Tail: " + tail.val);
        }
    }

    public void len() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node new_node = new Node(value);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
        length++;

    }

    public Node removeList() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node new_node = new Node(value);
        if (length == 0) {
            head = new_node;
            tail = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            tail = null;
            head = null;
        }
        return temp;
    }

    public Node get(int index){
        if( index<0 || index>=length){
            return null;
        }
        Node temp = head;
        for(int i =0 ;i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        while(temp != null){
            temp.val = value;
            return true;
        }
        return false;
    }
    public void atIndex(int index, int value){
        if(index<0 || index>length){
            System.out.println("Null");
        }
        if(index == 0){
            prepend(value);
        }
        if(index == length){
            append(value);
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next=temp.next;
        temp.next = newNode;
        length++;
    }

    public Node removeAtIndex(int index){
        if(index<0 || index> length){
            System.out.println("Null");
        }
        if(index == 0){
            removeFirst();
        }
        if(index== length-1){
            removeList();
        }
        Node pre = get(index -1);
        Node temp = pre.next;

        pre.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }
}

public class linkedlist {
    public static void main(String[] args) {
        ll obj = new ll(0);
        obj.append(1);
        obj.append(21);
        obj.append(3);
        obj.printList();

        
        obj.set(3, 4);
        // obj.printList();
        // obj.prinntHead();
        // obj.prinntTail();
        
        // obj.atIndex(2,50);
        // obj.printList();
        // obj.len();
        System.out.println();
        obj.removeAtIndex(2);
        obj.printList();

    }
}
