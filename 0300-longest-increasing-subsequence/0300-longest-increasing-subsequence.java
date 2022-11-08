class Solution {
    // using 1D DP table algorithm
    public int lengthOfLIS(int[] nums) {
        int[] dp  = new int[nums.length];
        Arrays.fill(dp, 1);
        int res = 1;
        for(int i=1; i<nums.length; i++) {
            for(int j=0; j<i; j++) {
                if (nums[j] < nums[i]) {
                    if (dp[i] <= 1+dp[j]) dp[i] = 1 + dp[j];
                    res = Math.max(res, dp[i]);
                }
                //System.out.println(i+ " "+Arrays.toString(dp)); 
            }
        }
        //System.out.println(Arrays.toString(dp));
        return res;
    }
    
    // using 2d DP algorithm
    public int COMMENTEDlengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        
        for(int i=1; i<=nums.length; i++) {
            for(int j=0; j<=nums.length; j++) {
                int take = 0;
                if (j == 0 || nums[i-1] < nums[j-1]) take = 1 + dp[i-1][i];
                int no = dp[i-1][j];
                dp[i][j] = Math.max(take, no);
            }
        }
        for(int[] a : dp) System.out.println(Arrays.toString(a));
        return dp[nums.length][0];
        
        // for(int[] a : dp) Arrays.fill(a, -1);
        // int res = fn(nums.length-1, -1, nums, dp);
        // for(int[] a : dp) System.out.println(Arrays.toString(a));
        // return res;
    }
    
    // using recursion and DP table
    private int fn(int i, int prev, int[] arr, int[][] dp) {
        if (i < 0) return 0;
        
        if (dp[i][prev+1] != -1) return dp[i][prev+1];
        
        int take = 0;
        if (prev == -1 || arr[i] < arr[prev]) take = 1 + fn(i-1, i, arr, dp); 
        
        int no = fn(i-1, prev, arr, dp);
        
        return dp[i][prev+1] = Math.max(take, no);
    }
}