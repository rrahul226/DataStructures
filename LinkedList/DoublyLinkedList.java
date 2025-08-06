import java.util.Scanner;

public class DoublyLinkedlist {
    public static void main(String[] args) {
        DoublyLinkedlistOp dll=new DoublyLinkedlistOp();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Insert First");
            System.out.println("2.Insert Last");
            System.out.println("3.Insert At Specific Position");
            System.out.println("4.Delete First");
            System.out.println("5.Delete Last");
            System.out.println("6.Delete At Specific Position");
            System.out.println("7.Display");
            System.out.println("8.Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.print("Enter Value: ");
                    int val1=sc.nextInt();
                    dll.InsertFirst(val1);
                    break;

                case 2:
                    System.out.print("Enter Value: ");
                    int val2=sc.nextInt();
                    dll.InsertLast(val2);
                    break;

                case 3:
                    System.out.print("Enter Value: ");
                    int val3=sc.nextInt();
                    System.out.print("Enter Position: ");
                    int pos3=sc.nextInt();
                    dll.InsertAtPos(val3,pos3);
                    break;

                case 4:
                    dll.deleteFirst();
                    break;

                case 5:
                    dll.deleteLast();
                    break;

                case 6:
                    System.out.print("Enter Position: ");
                    int pos6=sc.nextInt();
                    dll.deleteAtPosition(pos6);
                    break;

                case 7:
                    dll.display();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

class Node{
    int value;
    Node next;
    Node prev;
    Node(int value,Node next,Node prev)
    {
        this.value=value;
        this.next=next;
        this.prev=prev;
    }
    Node(int value)
    {
        this.value=value;
        this.next=null;
        this.prev=null;
    }
}

class DoublyLinkedlistOp{
    Node head;
    Node tail;
    int size;

    //Inserting Node at first
    public void InsertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        if(tail==null)
        {
            tail=node;
        }
        head=node;
        size++;
    }

    //Inserting Node at Last
    public void InsertLast(int value){
        Node node=new Node(value);
        if(tail==null){
            tail=node;
            head=node;
        }
        else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
        size++;
    }

    //Insert Node at any Position
    public void InsertAtPos(int value,int index){
        Node temp=head;
        if(index==0){
            InsertFirst(value);
        }
        if(index==size){
            InsertLast(value);
        }
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next,temp.prev);
        temp.next=node;
        size++;
    }

    //Delete Node at First
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
            size--;
        }
    }
    
    //Delete Node at Last
    public void deleteLast(){
        if(tail==null)
        {
            System.out.println("List is empty.........");
        }
        if(tail.prev==null){
            tail=null;
            head=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
            size--;
        }
    }

    //Delete at Specific Position
    public void deleteAtPosition(int index){
        if(index==0)
        {
            deleteFirst();
        }
        if(index==size-1)
        {
            deleteLast();
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.prev=temp.next;
        temp.next=temp.next.next;
        size--;
    }

    //Display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("End");
    }


}
