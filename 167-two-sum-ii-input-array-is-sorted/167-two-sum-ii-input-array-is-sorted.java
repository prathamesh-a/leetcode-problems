class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=nums.length-1; i>=0; i--){
            for(int j=nums.length-1; j>=i+1; j--){
                if(nums[i]+nums[j] == target){
                    arr[0] = i+1;
                    arr[1] = j+1;
                    return arr;
                }
            }
        }
        return arr;
    }
}