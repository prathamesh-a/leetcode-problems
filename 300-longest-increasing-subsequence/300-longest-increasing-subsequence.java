class Solution {
    public int lengthOfLIS(int[] nums) {
        int max = Integer.MIN_VALUE;

        int[] a = new int[nums.length];

        for(int i = 1;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[i] > nums[j]){
                    a[i] = Math.max(a[i],a[j]+1);
                    max = Math.max(max,a[i]);
                }
            }
        }

        return max == Integer.MIN_VALUE ? 1 : max+1;
    }
}