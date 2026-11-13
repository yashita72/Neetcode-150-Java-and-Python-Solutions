class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        min_price=float('inf')
        max_profit=0
        for i in range(len(prices)):
            if(prices[i]<min_price):
                min_price=prices[i]
            profit=prices[i]-min_price
            if(profit>max_profit):
                max_profit=profit
        return max_profit

#time complexity: O(n) bcs we are traversing the array only once
#space complexity: O(1) bcs we are using only 2 variables