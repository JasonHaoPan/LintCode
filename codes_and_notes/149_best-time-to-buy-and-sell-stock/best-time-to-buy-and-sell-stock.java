/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/best-time-to-buy-and-sell-stock
@Language: Java
@Datetime: 17-01-03 23:08
*/

public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        if(prices == null || prices.length == 0) return 0;
        int minprice = prices[0];
        int maxprofit = Integer.MIN_VALUE;
        for(int i = 1; i < prices.length; i++)
        {
            int diff = prices[i] - minprice;
            if(diff > maxprofit)
                {
                    maxprofit = diff;
                }
            if(prices[i] < minprice)
            {
                minprice = prices[i];
            }
        }
        if(maxprofit > 0)
            return maxprofit;
        else
            return 0;
    }
}