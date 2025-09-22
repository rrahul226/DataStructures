import java.util.*;
public class Main
{
	public static void main(String[] args) {
		StackUsingQueue Sq=new StackUsingQueue();
		Sq.push(10);
		Sq.push(20);
		Sq.push(30);
		Sq.push(40);
		Sq.display();
		Sq.pop();
		Sq.display();
		Sq.peek();
		System.out.println(Sq.isEmpty());
	}
}
class StackUsingQueue{
    private Stack<Integer> first;
    private Stack<Integer> second;
    StackUsingQueue(){
        this.first=new Stack<>();
        this.second=new Stack<>();
    }
    
    //Inserting Element
    public void push(int i){
        first.push(i);
    }
    
    //Deleting the first Element in Queue
    public void pop(){
        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        System.out.println("Poped Element: "+second.pop());        
        if(first.isEmpty()){
            while(!second.isEmpty()){
                first.push(second.pop());
            }
        }
    }
    
    //Peek Element in the Queue
    public void peek(){
        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        System.out.println("Peek: "+second.peek());
        if(first.isEmpty()){
            while(!second.isEmpty()){
                first.push(second.pop());
            }
        }
    }
    
    //Queue is Empty or Not
    public boolean isEmpty(){
        return first.isEmpty();
    }
    
    //Displaying Queue Elements
    public void display(){
        System.out.print("Queue Elements: ");
        for(int num:first){
            System.out.print(num+" ");
        }
        System.out.print("\n");
    }
}
