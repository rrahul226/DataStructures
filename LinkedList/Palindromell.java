public class palindromell {
    public static void main(String[] args) {
        Opll ll=new Opll();
        ll.InsertElement(10);
        ll.InsertElement(20);
        ll.InsertElement(30);
        ll.InsertElement(30);
        ll.InsertElement(20);
        ll.InsertElement(10);
        ll.display();
        ll.MiddleElement();
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
    //Middle Element
    public void MiddleElement(){
        Node first=head;
        Node second=head;
        while(second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
        }
        System.out.println("Middle Element is : "+first.value);
    }
    
    
    public void CheckPalindrome()
    {
      //First it reverse the from last to middle element
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

      //Then it start comparing 
      //first element with middle element -- if it is equal then move on next element else stop comparing return false
        Node first=head;
        Node mid=prev;
        boolean isPalindrome=true;
        while(first!=null && first!=prev){
            if(first.value!=mid.value){
                isPalindrome=false;
                break;
            }
            else{
                first=first.next;
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
}
