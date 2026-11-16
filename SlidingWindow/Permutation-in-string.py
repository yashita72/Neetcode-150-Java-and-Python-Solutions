from typing import Counter


class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1)>len(s2):
            return False
            
        freq1=Counter(s1)
        window=Counter(s2[:len(s1)])
        if freq1==window:
            return True
        left=0
        for right in range(len(s1),len(s2)):
             window[s2[right]]+=1
             window[s2[left]]-=1
             if window[s2[left]]==0:
                del window[s2[left]]
             left+=1
             if freq1==window:
                return True
        return False

#time complexity: O(n) where n is the length of s2
# space complexity: O(1) since the maximum number of characters in the window is 26        
        


        