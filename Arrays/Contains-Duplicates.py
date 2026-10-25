from typing import Counter


class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        count=Counter(nums)
        for c in count.values():
            if c >1:
                return True
        return False

        