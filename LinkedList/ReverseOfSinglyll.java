public class ReverseSinglyll {
    public static void main(String[] args) {
        Opll ll=new Opll();
        ll.InsertElement(10);
        ll.InsertElement(20);
        ll.InsertElement(30);
        ll.InsertElement(40);
        ll.InsertElement(50);
        ll.display();
        ll.Reversell();
    }
}

class Node{
    int value;
    Node next;
    Node(int value,Node next){
        this.value=value;
        this.next=next;
    }
    Node(int value){
        this.value=value;
        this.next=null;
    }
}

class Opll{
    Node head;
    Node tail;
    public void InsertElement(int value){
        Node node=new Node(value);
        if(head==null)
        {
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("End\n");
    }

    public void Reversell()
    {
        Node prev=null;
        Node current=head;
        Node next=current.next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            head=prev;
        }
        display();
    }
}
