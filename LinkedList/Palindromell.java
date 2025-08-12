public class Palindromell {
    public static void main(String[] args) {
        Opll ll=new Opll();
        ll.InsertElement(10);
        ll.InsertElement(20);
        ll.InsertElement(30);
        ll.InsertElement(30);
        ll.InsertElement(20);
        ll.InsertElement(10);
        ll.display();
        ll.CheckPalindrome();
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
    public void display(){
        display(head);
    }
    //Display
    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("End\n");
    }

    //First it findout the Middle element
    //Then it starts comparing each element with middle element
    //If it equal return true -- it is palindrome
    //Else return false -- Not palindrome

    public void CheckPalindrome()
    {
        Node first=head;
        Node second=head;
        while(second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
        }
        Node secondhalf=reverse(first); 
        Node start=head;
        Node mid=secondhalf;
        boolean isPalindrome=true;
        while(mid!=null){
            if(start.value!=mid.value){
                isPalindrome=false;
                break;
            }
            else{
                start=start.next;
                mid=mid.next;
            }
        }
        if(isPalindrome){
            System.out.print("\nLinkedlist is a Palindrome");
        }
        else{
            System.out.println("\nLinkedlist is not a Palindrome");
        }
    }
    
    private Node reverse(Node node){
        Node prev=null;
        Node current=node;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
