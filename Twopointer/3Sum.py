class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        ans=[]
        for i in range(len(nums)):

            left=i+1
            right=len(nums)-1
            if i > 0 and nums[i] == nums[i-1]:
                continue
            while(left<right):
             if nums[i]+nums[left]+nums[right]==0:
                ans.append([nums[i],nums[left],nums[right]])  
                left+=1
                right-=1
                while left < right and nums[left] == nums[left-1]:
                 left += 1

                while left < right and nums[right] == nums[right+1]:
                  right -= 1
             elif nums[i]+nums[left]+nums[right]<0:
                left+=1
             else:
                right-=1
        return ans
            
     #time complexity is big oh of n squared because 
     # we are iterating through the list nums once and for each element in the list,
     #  we are performing a two pointer approach which takes linear time.      
     # space complexity is big oh of 1 because we are using a constant amount of space     



        