class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][] dp = new int[prices.length][(k*2)+1];
        for(int[] a : dp) Arrays.fill(a, -1);
        int res = fn(0, k*2, prices, dp);
        return res;
    }
    
    private int fn(int i, int buy, int[] arr, int[][] dp) {
        
        if (i >= arr.length) return 0;
        if (dp[i][buy] != -1) return dp[i][buy];
        if (buy == 0) return dp[i][buy] = 0;
        
        int profit = 0;
        if (buy%2 == 0) {
            // can buy
            int b = fn(i+1, buy-1, arr, dp) - arr[i];
            int skip = fn(i+1, buy, arr, dp);
            profit = Math.max(b, skip);
        }
        else {
            // can sell
            int sell = fn(i+1, buy-1, arr, dp) + arr[i];
            int skip = fn(i+1, buy, arr, dp);
            profit = Math.max(sell, skip);
        }
        
        return dp[i][buy] = profit;
    }
    
}