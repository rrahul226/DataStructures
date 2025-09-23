import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution sol=new Solution();
        boolean res=sol.isValid("{]()[]");
        if(res){
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("Not Valid");
        }
    }
    
}

class Solution{
    public boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
            }
            else{
                if(ch=='}'){
                    if( stack.isEmpty() || stack.pop()!='{'){
                        return false;
                    }
                }
                if(ch==']'){
                    if( stack.isEmpty() || stack.pop()!='[' ){
                        return false;
                    }
                }
                if(ch==')'){
                    if( stack.isEmpty() || stack.pop()!='('){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
