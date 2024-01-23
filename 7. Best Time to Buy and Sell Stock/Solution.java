class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;
        int buy = prices[0], sell = prices[1], profit = sell-buy;
        for (int i = 1; i < prices.length - 1; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                sell = prices[i + 1];
            }
            if (prices[i + 1] > sell)
                sell = prices[i + 1];
            if (sell - buy > profit)
                profit = sell - buy;
        }
        return profit>0?profit:0;
    }
}

// Runtime: 2ms
// O(N)