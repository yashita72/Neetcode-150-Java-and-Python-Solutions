package Twopointer;
//time complexity is big oh of n because we are iterating through the array numbers once 
// and performing constant time operations for each element in the array.
//space complexity is big oh of 1 because we are using a constant amount of space 
// to store the left and right pointers.
class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
        if(numbers[left]+numbers[right]>target){
          right-=1;
        }
        else if(numbers[left]+numbers[right]<target){
          left+=1;
        }
        else if(numbers[left]+numbers[right]==target){
          return new int[]{left+1,right+1};
        }
        }

     return new int[]{};  
    }
}