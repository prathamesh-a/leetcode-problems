class Solution {
    public int findDuplicate(int[] nums) {
        // for(int i=0; i<nums.length-1; i++) {
        //     for(int j=i+1; j<nums.length; j++) {
        //         if (nums[i] == nums[j]) return nums[i];
        //     }
        // }
        // return 0;
        
        int[] arr = new int[nums.length];
        for (int i : nums){
            if (arr[i] == 0) arr[i] = i;
            else return i;
        }
        return 0;
    }
}