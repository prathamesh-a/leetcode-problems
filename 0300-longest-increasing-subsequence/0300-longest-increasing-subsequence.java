class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for(int[] a : dp) Arrays.fill(a, -1);
        int res = fn(nums.length-1, -1, nums, dp);
        return res;
    }
    
    private int fn(int i, int prev, int[] arr, int[][] dp) {
        if (i < 0) return 0;
        if (prev != -1) if (dp[i][prev] != -1) return dp[i][prev];
        int take = 0;
        if (prev == -1) take = 1 + fn(i-1, i, arr, dp); 
        else if (arr[i] < arr[prev]) take = 1 + fn(i-1, i, arr, dp);
        
        int no = fn(i-1, prev, arr, dp);
        if (prev != -1) dp[i][prev] = Math.max(take, no);
        return Math.max(take, no);
    }
}