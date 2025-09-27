public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        int[] nums={15,20,10,5,25,0};
        bst.Insert(nums);
        bst.display();
    }
}

class Node{
    int value;
    Node left;
    Node right;
    int height;
    Node(int value){
        this.value=value;
        this.height=1;
    }
}

//BinarySearchTree Operations
class BinarySearchTree{
    Node node;
    public void Insert(int[] arr){
        for(int i=0;i<arr.length;i++){
            Insertion(arr[i]);
        }
    }

    public void Insertion(int value){
        node=Insertion(value,node);
    }

    private Node Insertion(int val,Node node){
        if(node==null){
            return new Node(val);
        }
        if(val<node.value){
            node.left=Insertion(val,node.left);
        }
        if(val>node.value){
            node.right=Insertion(val,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    

    private int height(Node node){
        return (node==null) ? 0 : node.height;
    }

    //Pre-Order Traversal
    public void display(){
        System.out.print("Height of the BST: "+node.height+"\n");
        display(node);
    }

    private void display(Node node){
        if(node!=null){
            display(node.left);
            System.out.print(node.value+" ");
            display(node.right);
        }
    }
}
