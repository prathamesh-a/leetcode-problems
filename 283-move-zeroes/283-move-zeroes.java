class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr = nums.clone();
        int j = nums.length-1;
        int f = 0;
        for(int i=0; i<nums.length; i++){
            if(arr[i] != 0) {
                nums[f] = arr[i]; f++;
            }
            else{
                nums[j] = 0; j--;
            }
        }
    }
}