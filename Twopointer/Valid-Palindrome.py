class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1=s.lower()
        left,right=0,len(s)-1
        while(left<right):

            if  not s1[left].isalnum():
                left+=1
            elif not s1[right].isalnum():
                right-=1
            elif s1[left]==s1[right]:
                left+=1
                right-=1
            else:
                return False
        return True
        
#time complexity is big oh of n because we are iterating through the string s once and performing constant time operations for each character in the string.
#space complexity is also big oh of n because we are creating a new string s1 which is a copy of the original string s but in lowercase.

        