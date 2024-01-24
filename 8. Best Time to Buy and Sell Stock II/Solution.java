class Solution {
    public int maxProfit(int[] prices) {
        int buy=0, sell=1, profit=0;
        while(sell<prices.length){
            if (prices[buy]<prices[sell])
            {
                profit+=prices[sell]-prices[buy]; //keep adding if sell>buy
                buy++;
            }    
            else
                buy=sell;
            sell++;
        }
        return profit;
    }
}

