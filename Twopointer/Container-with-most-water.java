package Twopointer;
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_area=0;
        while(left<right){
            int length= Math.min(height[left],height[right]);
            int breadth=right-left;
            int area=length*breadth;
            if(area>max_area){
                max_area=area;
            }
            if(height[left]<height[right]){
                left+=1;
            }
            else{
                right-=1;
            }
        }
        return max_area;
        
    }
}