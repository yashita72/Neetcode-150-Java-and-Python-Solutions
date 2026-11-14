
class Solution:
    def characterReplacement(self, s: str, k: int) -> int:

        left = 0
        max_freq = 0
        max_length = 0

        count = {}

        for right in range(len(s)):

            count[s[right]] = count.get(s[right], 0) + 1#store the count of the character at the right pointer in the count dictionary

            max_freq = max(max_freq, count[s[right]])#update the maximum frequency of any character in the current window

            while (right - left + 1) - max_freq > k:#if the length of the current window minus the maximum frequency is greater than k, we need to shrink the window from the left

                count[s[left]] -= 1
                left += 1

            max_length = max(max_length, right - left + 1)#update the maximum length of the substring found so far

        return max_length
    #time complexity is O(n) because we are traversing the string only once
    #space complexity is O(1) because we are using a fixed size dictionary to store the count of characters
