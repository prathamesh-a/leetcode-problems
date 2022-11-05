class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length+1][2];
        for(int[] a : dp) Arrays.fill(a, -1);
        int res = fn(0, 1, prices, dp, fee);
        //for(int[] a : dp) System.out.println(Arrays.toString(a));
        return res;
    }
    
    private int fn(int i, int buy, int[] arr, int[][] dp, int fee) {
        
        if (i >= arr.length) return 0;
        
        if (dp[i][buy] != -1) return dp[i][buy];
        
        int profit = 0;
        if (buy == 1) {
            // can buy
            int b = fn(i+1, 0, arr, dp, fee) - arr[i];
            int skip = fn(i+1, 1, arr, dp, fee);
            profit = Math.max(b, skip);
        }
        else {
            // can sell
            int sell = fn(i+1, 1, arr, dp, fee) + arr[i]- fee;
            int skip = fn(i+1, 0, arr, dp, fee);
            profit = Math.max(sell, skip);
        }
        
        return dp[i][buy] = profit;
    }
}