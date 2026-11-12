class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        result=[]
        left=0
        right=len(numbers)-1
        while left<right:
            if numbers[left]+numbers[right]<target:
                left+=1
            elif numbers[left]+numbers[right]>target:
                right-=1
            elif numbers[left]+numbers[right]==target:
                result.append(left+1)
                result.append(right+1)
                return result
            
#time complexity is big oh of n because we are iterating through the list numbers once 
# and performing constant time operations for each element in the list.   
# space complexity is big oh of 1 because we are using a constant amount of space 
# to store the result list and the left and right pointers.           


        

    
        