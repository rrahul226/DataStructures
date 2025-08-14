public class CustomStack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        System.out.println("Popped element is: "+s.pop());
        System.out.println("Peek Element is: "+s.peek());
        s.display();
    }
}

class Stack{
    private static final int DEFAULT_SIZE=10;
     int[] data;
    int ptr=-1;
    public Stack(){
        this.data=new int[DEFAULT_SIZE];
        this.ptr=-1;
    }
    public boolean push(int value){
        if(isFull()){
            System.out.print("Stack is full");
            return false;
        }
        data[++ptr]=value;
        return true;
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Cannot pop from the stack");
        }
        return data[ptr--];
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

    public int peek(){
        return data[ptr];
    }

    public void display(){
        for(int i=0;i<=ptr;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println(" ");
    }
}
