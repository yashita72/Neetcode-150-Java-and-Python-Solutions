from typing import Counter


class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count1=Counter(s)
        count2=Counter(t)
        if count1.items() == count2.items():
            return True
        return False
            






        