class Node {
    Node left;
    Node right;
    int value;

    Node(int value) {
        this.value = value;
    }
}

class BinaryTree {
    Node root;
}

public class tree {

    public static void main(String[] args) {

        BinaryTree obj = new BinaryTree();
        System.out.println(obj.root);
    }
}