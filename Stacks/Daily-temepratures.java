import java.util.Stack;

class Solution {//Brute Force Approach
    public int[] dailyTemperatures(int[] temperatures) {
        int answer[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    answer[i]=j-i;
                    break;
                }

            }
        }
       return answer;
    }
}//Time Complexity: O(n^2) where n is the number of temperatures in the input array.
//  In the worst case, for each temperature, we may need to check all subsequent temperatures
//Space Complexity: O(n) where n is the number of temperatures in the input array.
class Solution2 {//Montonically Decreasing Stack Approach
    public int[] dailyTemperatures(int[] temperatures) {
        int answer[]=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                int previndex=stack.pop();
                answer[previndex]=i-previndex;
            }
            stack.push(i);
        }
       return answer;
    }
}//Time Complexity: O(n) where n is the number of temperatures in the input array.
//  Each temperature is pushed and popped from the stack at most once, leading to linear time complexity.
//Space Complexity: O(n) where n is the number of temperatures in the input array.
