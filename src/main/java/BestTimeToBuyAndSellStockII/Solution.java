package BestTimeToBuyAndSellStockII;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
 */
class Solution {
    public int maxProfit(int[] prices) {
        int lastPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (lastPrice <= price) {
                maxProfit += price - lastPrice;
            }
            lastPrice = price;
        }
        return maxProfit;
    }
}