class Solution:
    def maxArea(self, height: list[int]) -> int:
        left=0
        right=len(height)-1
        max_area=0
        while left<right:
            length=min(height[left],height[right])
            breadth=right-left
            area=length*breadth 
            if(area>max_area):
                max_area=area
            if(height[left]<height[right]):
                left+=1
            else:
                right-=1
        return max_area
#time complexxity is big oh of n because we are traversing the array only once
# space complexity is big oh of 1 because we are not using any extra space
            
        