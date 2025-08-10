public class Main {
    public static void main(String[] args) {
        Opll ll=new Opll();
        ll.InsertElement(10);
        ll.InsertElement(20);
        ll.InsertElement(30);
        ll.InsertElement(40);
        ll.InsertElement(50);
        ll.display();
        ll.MiddleElement();
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
    public void InsertElement(int val){
        Node node=new Node(val);
        if(head==null){
            tail=node;
            head=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }
    //Display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("End\n");
    }
    //Middle Element
    public void MiddleElement(){
        Node first=head;
        Node second=head;
        while(second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
        }
        System.out.print("\n"+first.value);
    }
}
