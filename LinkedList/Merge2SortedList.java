public class MergeSortedll {
    public static void main(String[] args) {
        Opll ll=new Opll();
        //Linkedlist1
        ll.InsertElement(1);
        ll.InsertElement(2);
        ll.InsertElement(3);
        ll.display();
        //Linkedlist2
        Opll ll2=new Opll();
        ll2.InsertElement(0);
        ll2.InsertElement(1);
        ll2.InsertElement(2);
        ll2.display();
        //MergeList
        Mergell merge=new Mergell();
        merge.Merge(ll.head,ll2.head);
    }
}
class Node{
    Node next;
    int value;
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
        if(head==null){
            tail=node;
            head=node;
        }
        tail.next=node;
        tail=node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("End\n");
    }
}

class Mergell{
    public void Merge(Node h1,Node h2){
        Node f=h1;
        Node s=h2;
        Opll ans=new Opll();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.InsertElement(f.value);
                f=f.next;
            }
            else{
                ans.InsertElement(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.InsertElement(f.value);
            f=f.next;
        }
        while(s!=null)
        {
            ans.InsertElement(s.value);
            s=s.next;
        }
        System.out.println("Merge list are: ");
        ans.display();
    }
}
