class Solution {
    public boolean canJump(int[] nums) {
        int curr = 0;
        int last =0;
        
        for(int i=0;i<nums.length ;i++ ){
          last = Math.max(last, i+nums[i] );
            
            if(i== curr){
                curr = last;
            }
        }
        
        if(curr >=nums.length-1 ) return true;
        else return false;
    }
}