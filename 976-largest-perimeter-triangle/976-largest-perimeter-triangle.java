class Solution {
    public int largestPerimeter(int[] nums) {
        int p=0;
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=2; i--){
            if(nums[i] < nums[i-1]+nums[i-2]){
                int pe = nums[i]+nums[i-1]+nums[i-2];
                if(pe > p) p=pe;
            }
        }
        return p;
    }
}