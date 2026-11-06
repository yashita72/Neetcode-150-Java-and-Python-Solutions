import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // An odd length string can never have balanced pairs
        if (s.length() % 2 != 0) {
            return false;
        }

        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                // If stack is empty before matching a closing bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check for bracket mismatch
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();// If stack is empty, all brackets are matched
    }
}//Time Complexity: O(n) - We traverse the string once, where n is the length of the string.
//Space Complexity: O(n) - In the worst case, we may have to store all opening brackets in the stack.