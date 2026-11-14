class LongestSubstringWithoutRepeatingCharacters:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left=0
        max_length=0
        seen=set()
        for right in range(len(s)):
            while s[right]in seen:
                seen.remove(s[left])
                left+=1
            seen.add(s[right])
            max_length=max(max_length,right-left+1)
        return max_length
#time complexity is O(n) because we are traversing the string only once
#space complexity is O(n) because we are using a set to store the characters in the substring
        
        
