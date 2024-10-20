import java.util.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;

        int profit = 0;

        int price = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < price) {
                price = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - price);
            }
        }
        return profit;
    }
}