class Solution {
    public int search(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                c=i;
                break;
            }
            else
                c=-1;
            } 
        return c;
    }
}