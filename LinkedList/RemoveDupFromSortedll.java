public class DuplicateLl {
    public static void main(String[] args) {
        DuplicateLinkedl ll=new DuplicateLinkedl();
        ll.InsertElement(10);
        ll.InsertElement(10);
        ll.InsertElement(20);
        ll.InsertElement(30);
        ll.InsertElement(40);
        ll.InsertElement(40);
        ll.removedup();
        ll.display();
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

class DuplicateLinkedl
{
    Node head;
    Node tail;
    int size;
    public void InsertElement(int value)
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
    public void removedup()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.value==temp.next.value)
            {
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }
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
