package leetcode;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int min = 0;
        int max = 1;
        int profit = 0;
        while (max < prices.length) {
            if (prices[min] < prices[max]) {
                profit = Math.max(profit, prices[max] - prices[min]);
            } else {
                min = max;
            }
            max++;
        }
        return profit;
    }
}
