class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i : nums){
            if(i == val) count++;
        }
        //int[] arr = new int[nums.length - count];
        int ind = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val) {
                nums[ind] = nums[i];
                ind++;
            }
        }
        return nums.length-count;
    }
}