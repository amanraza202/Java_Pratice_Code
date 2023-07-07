class Node {
    Node next;
    int value;

    Node(int value) {
        this.value = value;
    }

}

class stack1 {
    private Node top;
    private int height;

    stack1(int value) {
        Node newnode = new Node(value);
        top = newnode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        if (top == null) {
            System.out.println("Stack is Empty");
        }
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void getTop() {
        System.out.println("Top:" + top.value);
    }

    public void getHeight() {
        System.out.println("Height:" + height);
    }

    public void push(int value) {
        Node newnode = new Node(value);
        if (top == null) {
            top = newnode;
        }
        newnode.next = top;
        top = newnode;
        height++;

    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
        }

        Node temp = top;
        top = top.next;
        temp.next = null;

        height--;
    }
}

public class stack {

    public static void main(String[] args) {
        stack1 obj = new stack1(5);
        obj.push(8);
        obj.push(16);
        obj.push(28);
        obj.pop();
        obj.printStack();

        obj.getTop();
        obj.getHeight();

    }
}