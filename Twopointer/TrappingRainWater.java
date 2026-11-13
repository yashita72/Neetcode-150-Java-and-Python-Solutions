public class TrappingRainWater {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int water=0;
        int left_max=0;
        int right_max=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>left_max){
                    left_max=height[left];
                }
                else{
                    water+=left_max-height[left];
                }
                left++;
            }
            else{
                if(height[right]>right_max){
                    right_max=height[right];
                }
                else{
                    water+=right_max-height[right];
                }
                right--;
            }
        }
        return water;

        
    }
} 
//time complexity is big oh of n because we are traversing the array only once
// space complexity is big oh of 1 because we are not using any extra space