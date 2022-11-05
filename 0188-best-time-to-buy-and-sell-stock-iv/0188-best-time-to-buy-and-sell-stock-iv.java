class Solution {
    public int maxProfit(int k, int[] prices) {
        if (k == 1) return one(prices);
        
        int[][] dp = new int[prices.length+1][(k*2)+1];
        
        for(int i=prices.length-1; i>=0; i--) {
            for(int j=0; j<=(k*2); j++) {
                if (j == 0) continue;
                if (j%2 == 0) {
                    int b = dp[i+1][j-1] - prices[i];
                    int skip = dp[i+1][j];
                    dp[i][j] = Math.max(b, skip);
                }
                else {
                    int sell = dp[i+1][j-1] + prices[i];
                    int skip = dp[i+1][j];
                    dp[i][j] = Math.max(sell, skip);
                }
            }
        }
        //for(int a[] : dp) System.out.println(Arrays.toString(a));
        return dp[0][k*2];
        
        
        // int[][] dp = new int[prices.length][(k*2)+1];
        // for(int[] a : dp) Arrays.fill(a, -1);
        // int res = fn(0, k*2, prices, dp);
        // return res;
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
    
    private int one(int[] prices) {
        int min = prices[0];
        int profit = 0;
        
        for(int i=1; i<prices.length; i++) {
            int currProfit = prices[i] - min;
            profit = Math.max(profit, currProfit);
            min = Math.min(min, prices[i]);
        }
        
        return profit;
    }
    
}