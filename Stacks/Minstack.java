import java.util.Deque;//deque is a double ended queue which can be used as stack or queue
import java.util.ArrayDeque;//array deque is a resizable array implementation of the deque interface.
//  It provides constant time performance for the basic operations (add, remove, and peek) at both ends of the deque.
class MinStack {
    private Deque<Integer> stack;//stack to store all elements
    private Deque<Integer> minstack;//stack to store minimum elements
    public MinStack() {
        stack=new ArrayDeque<>();//ArrayDeque is used here instead of Stack because it is more efficient and has better performance.
        minstack=new ArrayDeque<>();
    }
    public void push(int value) {
        stack.push(value);
        if(minstack.isEmpty()||minstack.peek()>=value){
            minstack.push(value);
        }
    }
    public void pop() {
        if(stack.peek().equals(minstack.peek())){
            minstack.pop();
        }
        stack.pop();
    }
    public int top() {//returns the top element of the stack
        return stack.peek();
    }
    public int getMin() {//returns the minimum element in the stack
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//Time Complexity: O(1) for push, pop, top, and getMin operations.
//Space Complexity: O(n) where n is the number of elements in the stack. 
// In the worst case, all elements are pushed onto the stack and the minstack, 
// resulting in O(n) space usage.
