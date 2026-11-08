import java.util.Arrays;
import java.util.Stack;
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        if(n==0){return 0;}
        int [][]cars=new int[n][2];
        for(int i=0;i<n;i++){//2D array to store position and speed of each car
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars,(a,b)->Integer.compare(b[0],a[0]));//sort cars in decreasing order of position
        Stack<Double> stack=new Stack<>();
        for(int i=0;i<n;i++){
            double time=(double)(target-cars[i][0])/cars[i][1];//calculate time taken for each car to reach the target
            if(stack.isEmpty()||time>stack.peek()){//if stack is empty or time is greater than the top of the stack, push time onto the stack
                stack.push(time);
            }
        }
        return stack.size();
    }
}//Time complexity: O(nlogn) for sorting the cars and O(n) for iterating through the cars,
//  so overall time complexity is O(nlogn). Space complexity: O(n) for the stack.
