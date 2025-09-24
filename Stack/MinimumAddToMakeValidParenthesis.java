import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int res=sol.isValid("())");
        System.out.println(res);
    }
    
}

class Solution{
    public int isValid(String s){
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
