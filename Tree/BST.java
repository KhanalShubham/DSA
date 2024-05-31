package Tree;

public class BST {

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    Node get(Node root, int data){
        if (root==null) {
            return null;
        }
        if(data<root.data){
            return get(root.left, data);
        }
        else if(data>root.data){
            return get(root.right, data);
        }
        return root;
    }

    Node createBST(Node root, int data){
        if (root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=createBST(root.left, data);
        }
        else if(data>root.data) {
            root.right=createBST(root.right, data);
            
        }
        return root;
    }
    public static void main(String[] args) {
        BST bst= new BST();
        Node root= bst.createBST(null, 11);
        root=bst.createBST(root, 6);
        root=bst.createBST(root, 6);
        root=bst.createBST(root, 8);
        root=bst.createBST(root, 19);
        root=bst.createBST(root, 14);
        root=bst.createBST(root, 10);
        root=bst.createBST(root, 5);
        root=bst.createBST(root, 17);
        root=bst.createBST(root, 43);
        root=bst.createBST(root, 49);
        root=bst.createBST(root, 31);
    }
}

