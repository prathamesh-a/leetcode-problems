class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        
        for(int i=nums.length-2; i>=0; i--) {
            if (nums[i] == 0) {dp[i] = Integer.MAX_VALUE;continue;}
            int min = Integer.MAX_VALUE;
            for(int x=1; x<=nums[i]; x++) {
                int curr = Integer.MAX_VALUE;
                if (i+x < nums.length) curr = dp[i+x];
                min = Math.min(min, curr);
            }
            if (min != Integer.MAX_VALUE) dp[i] = 1+min;
            else dp[i] = min;
        }
        //System.out.println(Arrays.toString(dp));
        return dp[0];
        
        // Arrays.fill(dp, -1);
        // int res = fn(0, nums, dp);
        // System.out.println(Arrays.toString(dp));
        // return res;
    }
    
    private int fn(int i, int[] arr, int[] dp) {
        
        if (i >= arr.length) return Integer.MAX_VALUE;
        
        if (dp[i] != -1) return dp[i];        
        
        if (i == arr.length-1) return dp[i] = 0;
        if (arr[i] == 0) return dp[i] = Integer.MAX_VALUE;
        
        int min = Integer.MAX_VALUE;
        for(int x=1; x<=arr[i]; x++) {
            int curr = fn(i+x, arr, dp);
            min = Math.min(min, curr);
        }
        if (min == Integer.MAX_VALUE) return dp[i] = min;
        return dp[i] = 1+min;
    }
}