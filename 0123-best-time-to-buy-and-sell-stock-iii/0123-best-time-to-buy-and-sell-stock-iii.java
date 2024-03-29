class Solution {
    
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length+1][5];
        
        for(int i=prices.length-1; i>=0; i--) {
            for(int j=0; j<=4; j++) {
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
        return dp[0][4];
        
        
        // for(int[] a : dp) Arrays.fill(a, -1);
        // int res = fn(0, 4, prices, dp);
        // for(int[] a : dp) System.out.println(Arrays.toString(a));
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
    
    
    // public int maxProfit(int[] prices) {
    //     int[][][] dp = new int[prices.length][2][3];
    //     for(int[][] aa : dp) for(int[] a : aa) Arrays.fill(a, -1);
    //     int res = fn(0, 1, prices, 0, dp);
    //     return res;
    // }
    
//      private int fn(int i, int buy, int[] arr, int n, int[][][] dp) {
        
//         if (i >= arr.length) return 0;
//         if (n == 2) return 0;
//         if (dp[i][buy][n] != -1) return dp[i][buy][n];
        
//         int profit = 0;
//         if (buy == 1) {
//             // can buy
//             int b = fn(i+1, 0, arr, n, dp) - arr[i];
//             int skip = fn(i+1, 1, arr, n, dp);
//             profit = Math.max(b, skip);
//         }
//         else {
//             // can sell
//             int sell = fn(i+1, 1, arr, n+1, dp) + arr[i];
//             int skip = fn(i+1, 0, arr, n, dp);
//             profit = Math.max(sell, skip);
//         }

//         return dp[i][buy][n] = profit;
//     }
}