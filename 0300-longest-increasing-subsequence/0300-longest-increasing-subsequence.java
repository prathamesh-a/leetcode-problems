class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length+1];
        for(int[] a : dp) Arrays.fill(a, -1);
        int res = fn(nums.length-1, -1, nums, dp);
        return res;
    }
    
    private int fn(int i, int prev, int[] arr, int[][] dp) {
        if (i < 0) return 0;
        
        if (dp[i][prev+1] != -1) return dp[i][prev+1];
        
        int take = 0;
        if (prev == -1 || arr[i] < arr[prev]) take = 1 + fn(i-1, i, arr, dp); 
        
        int no = fn(i-1, prev, arr, dp);
        
        return dp[i][prev+1] = Math.max(take, no);
    }
}