package BinarySearch;

class Solution {
    public int search(int[] nums, int target) {
        return searchbinary(nums,target,0,nums.length-1);
    }
    private int searchbinary(int[] nums, int target,int l , int r){
            if(l>r){
                return -1;
            }
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                return searchbinary(nums,target,l,mid-1);
            }
            else{
                return searchbinary(nums,target,mid+1,r);
            }
    }
}
//Time Complexity: O(log n) - The search space is halved with each recursive call,
//  leading to logarithmic time complexity.
//Space Complexity: O(log n) - The recursive calls add to the call stack,
//  resulting in logarithmic space complexity.