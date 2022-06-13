class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0; i<=nums.length; i++){
            boolean present = false;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==i) {
                    present = true;
                    break;
                }
            }
            if(!present) return i;
        }
        return 0;
    }
}