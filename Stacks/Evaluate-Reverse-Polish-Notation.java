import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        int res=0;
        for(String s:tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                if (s.equals("+")){res= a+b;}
                if (s.equals("-")){res= a-b;}
                if( s.equals("*")){res= a*b;}
                if (s.equals("/")){res=a/b;}
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
        
    }
}//Time Complexity: O(n) where n is the number of tokens in the input array.
//  Each token is processed once, and stack operations (push and pop) take constant time.
//Space Complexity: O(n) where n is the number of tokens in the input array.
//  The space used by the stack is proportional to the number of tokens in the input array.