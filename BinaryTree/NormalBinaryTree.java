import java.util.*;
public class Main
{
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		Scanner sc=new Scanner(System.in);
		bt.Insert(sc);
		bt.display();
	}
}

class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value=value;
    }
}

class BinaryTree{
    Node root;
    void Insert(Scanner sc){
        System.out.println("Insert Root Element: ");
        int value=sc.nextInt();
        root=new Node(value);
        Populate(sc,root);
    }
    private void Populate(Scanner sc,Node root){
        System.out.print("Do you want to Insert left Node "+root.value+" : ");
        boolean left=sc.nextBoolean(); //True or False
        if(left){
            System.out.print("Insert left Node : ");
            int value=sc.nextInt();
            root.left=new Node(value);
            Populate(sc,root.left);
        }
        System.out.print("Do you want to Insert right Node "+root.value+" : ");
        boolean right=sc.nextBoolean(); //True or False
        if(right){
            System.out.print("Insert right Node : ");
            int value=sc.nextInt();
            root.right=new Node(value);
            Populate(sc,root.right);
        }
    }
    
    //In-Order Traversal
    void display(){
        display(root);
    }
    void display(Node root){
        if(root!=null){
            display(root.left);
            System.out.print(root.value+" ");
            display(root.right);
        }
    }
}
