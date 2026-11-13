package SlidingWindow;
public class Besttimetobuyandsellstock{
    public int maxProfit(int[] prices) {
       int min_price=Integer.MAX_VALUE;
       int max_profit=0;
       for(int i=0;i<prices.length;i++){
        if(prices[i]<min_price){
            min_price=prices[i];
        }
        int profit=prices[i]-min_price;
        if(profit>max_profit){
            max_profit=profit;
        }
       }
       return max_profit;


        
    }
}//Time Complexity: O(n) where n is the number of prices in the input array.
//  We traverse the array only once, performing constant-time operations for each price.
//Space Complexity: O(1) as we are using only a constant amount of extra space (min_price and max_profit variables).