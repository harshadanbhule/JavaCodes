import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
class BinaryTree{
    Scanner sc=new Scanner(System.in);

    Node constructBT(){
        System.out.println("Enter data for Node");
        int data=sc.nextInt();

        Node newNode=new Node(data);

        System.out.println("Do you want to eneter node at left side of "+newNode.data);
        char leftNode=sc.next().charAt(0);
        
        if(leftNode=='y'||leftNode=='Y'){
            newNode.left=constructBT();
        }

        System.out.println("Do you want to eneter node at right side of "+newNode.data);
        char rightNode=sc.next().charAt(0);
        
        if(rightNode=='y'||rightNode=='Y'){
            newNode.right=constructBT();
        }

        return newNode;

    }

    void preOrderBT(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        preOrderBT(root.left);
        preOrderBT(root.right);
    }

    void inOrderBT(Node root){
        if(root==null){
            return;
        }
        
        inOrderBT(root.left);
        System.out.print(root.data +" ");
        inOrderBT(root.right);
    }

    void postOrderBT(Node root){
        if(root==null){
            return;
        }
        
        postOrderBT(root.left);
        postOrderBT(root.right);
        System.out.print(root.data +" ");
    }

    public static void main(String[] args) {
        Node root=null;

        BinaryTree bt=new BinaryTree();
        root=bt.constructBT();
        System.out.println("Preorder");
        bt.preOrderBT(root);

        System.out.println("Inorder");
        bt.inOrderBT(root);

        System.out.println("Postorder");
        bt.postOrderBT(root);

    }
}
