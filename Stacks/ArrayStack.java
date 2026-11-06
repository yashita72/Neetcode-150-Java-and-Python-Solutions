public class ArrayStack {
    private int[] arr;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // -1 represents an empty stack
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push " + x);
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
//Time Complexity: O(1) for push, pop, peek, isEmpty, and size operations.
//Space Complexity: O(n) where n is the capacity of the stack.