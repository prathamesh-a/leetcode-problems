class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<=i; j++){
                count += nums[j];
            }
            arr[i] = count;
        }
        return arr;
    }
}