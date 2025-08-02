import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedlistOp ll=new LinkedlistOp();
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
                    ll.InsertFirst(val1);
                    break;

                case 2:
                    System.out.print("Enter Value: ");
                    int val2=sc.nextInt();
                    ll.InsertLast(val2);
                    break;

                case 3:
                    System.out.print("Enter Value: ");
                    int val3=sc.nextInt();
                    System.out.print("Enter Position: ");
                    int pos3=sc.nextInt();
                    ll.InsertAtPos(val3,pos3);
                    break;

                case 4:
                    ll.deleteFirst();
                    break;

                case 5:
                    ll.deleteLast();
                    break;

                case 6:
                    System.out.print("Enter Position: ");
                    int pos6=sc.nextInt();
                    ll.deleteAtPosition(pos6);
                    break;

                case 7:
                    ll.display();
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
    Node(int value,Node next)
    {
        this.value=value;
        this.next=next;
    }
    Node(int value)
    {
        this.value=value;
        this.next=null;
    }
}

class LinkedlistOp
{
    Node head;
    Node tail;
    int size;
    public void InsertFirst(int value)
    {
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }
    //Inserting data at last
    public void InsertLast(int value)
    {
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        if(tail==null)
        {
            head=node;
            tail=node;
        }
        size++;
    }
    //Insert Data at any position
    public void InsertAtPos(int value,int pos)
    {
        if(pos==0)
        {
            InsertFirst(value);
        }
        else if(pos==size)
        {
            InsertLast(value);
        }
        Node temp=head;
        int i=1;
        while(i<pos)
        {
            temp=temp.next;
            i++;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    //Delete First Element
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty...");
        }
        head=head.next;
        size--;
    }
    //Delete at Last
    public void deleteLast()
    {
        if(size<=1)
        {
            deleteFirst();
        }
        Node temp=head;
        for(int i=0;i<size-2;i++)
        {
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    //Delete At Position
    public void deleteAtPosition(int pos)
    {
        if(pos>size)
        {
            System.out.println("Invalid Location..!! Give Exact location....");
            return;
        }
        if(pos==0)
        {
            deleteFirst();
        }
        else if(pos==size-1)
        {
            deleteLast();
        }
        Node temp=head;
        for(int i=1;i<pos;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    //Display
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("End\n");
    }
}
