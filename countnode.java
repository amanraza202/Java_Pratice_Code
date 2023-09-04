package Tree;

import java.util.*;

public class countnode {
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public static class binaryTree{
            static int inx = -1;
            public static Node buildTree(int node[]){
                inx++;
                if (node[inx] == -1){
                    return null;
                }
                Node newnode = new Node(node[inx]);
                newnode.left = buildTree(node);
                newnode.right = buildTree(node);

                return newnode ;
            }
        }
    }
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int leftcount = countNode(root.left);
        int rightcount = countNode(root.right);

        return leftcount+rightcount+1;
    }
    public static void main(String[] args) {
    int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binaryTree tree = new binaryTree();
    Node root = tree.buildTree(node);
    System.out.println(countNode(root));
 
    }
}
