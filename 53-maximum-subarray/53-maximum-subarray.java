class Solution {
    public int maxSubArray(int[] nums) {
        
//         if (nums.length == 1) return nums[0];
//         int n = nums.length;
//         int max = Integer.MIN_VALUE;
        
//         for(int i=0; i<n; i++) {
//             int sum = 0;
//             for(int j=i; j<n; j++) {
//                 sum += nums[j];
//                 max = Math.max(max, sum);
//             }
//         }
//         return max;
        
        int sum = 0;
        int max = nums[0];
        
        for(int x : nums) {
            sum += x;
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        
        return max;
    }
}