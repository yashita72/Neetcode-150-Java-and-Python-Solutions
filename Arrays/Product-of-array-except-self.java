class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n=nums.length;
        int[]ans=new int[n];
        int prefix=1;
        for(int i=0;i<nums.length;i++){//prefix product
            ans[i]=prefix;
            prefix=prefix*nums[i];
            }
        
        int suffix=1;
        for(int i=n-1;i>=0;i--){//suffix product
            ans[i]=ans[i]*suffix;
            suffix=suffix*nums[i];
        }
        return ans;
        
    }
}
//time complexity is O(n) and space complexity is O(1) as
//  we are not using any extra space except for the output array.
