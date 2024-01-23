class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;
        int buy = 0, sell = 1, profit = 0;
        while (sell<prices.length){
            if (prices[buy]<prices[sell])
                profit = Math.max(profit,prices[sell]-prices[buy]);
            else
                buy = sell;
            sell++;
        }
        return profit; 
    }
}

//credits: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/1735550/python-javascript-easy-solution-with-very-clear-explanation