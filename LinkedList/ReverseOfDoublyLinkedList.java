public class ReverseOfdll {
    public static void main(String[] args) {
        ReverseLinkedList ll=new ReverseLinkedList();
        ll.InsertElement(10);
        ll.InsertElement(20);
        ll.InsertElement(30);
        ll.InsertElement(40);
        ll.InsertElement(50);
        ll.InsertElement(60);
        ll.InsertElement(70);
        ll.display();
        ll.displayRev();
    }
}


class Node{
    int value;
    Node next;
    Node prev;
    Node(int value)
    {
        this.value=value;
        this.next=null;
        this.prev=null;
    }
}

class ReverseLinkedList{
    Node head;
    Node tail;
    public void InsertElement(int value){
        Node node=new Node(value);
        if(head!=null){
            head.prev=node;
        }
        else{
            tail=node;
        }
        node.prev=null;
        node.next=head;
        head=node;
    }
    //Original List
    public void display()
    {
        System.out.println("Original List: ");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    //Reverse LinkedList
    public void displayRev(){
        System.out.println("Reverse List: ");
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.prev;
        }
        System.out.print("End");
    }
}
