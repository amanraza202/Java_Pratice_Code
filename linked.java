public class linked {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            Node currnode = head;
            while (currnode.next != null) {
                currnode = currnode.next;
            }
            currnode.next = newNode;
        }

    } 
    public void print(){
        Node currnode = head;
        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            while(currnode != null){
                System.out.print(currnode.data + "->");
                currnode = currnode.next;
            }
            System.out.println("NULL");
        }
    }

    // Delete a node
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        else{
            head= head.next;
        }
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public static void main(String[] args) {
        linked obj = new linked();
        obj.addFirst("is");
        obj.addFirst("This");
        obj.addLast("a");
        obj.addLast("List");
        obj.print();
        obj.deleteFirst();
        obj.print();
        obj.deleteLast();
        obj.print();
    }
}
