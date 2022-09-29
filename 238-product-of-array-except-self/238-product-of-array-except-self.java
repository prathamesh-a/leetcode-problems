class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] res = new int[nums.length];
        // for(int i=0; i<nums.length; i++) {
        //     int mul = 1;
        //     for(int j=0; j<nums.length; j++) {
        //         if (i != j) {
        //             mul *= nums[j];
        //         }
        //     }
        //     res[i] = mul;
        // } 
        // return res;
        
        if (nums.length < 2) return nums;
        int mul = 1;
        int zeros = 0;
        for(int x : nums) {
            mul *= x;
            if (x == 0) zeros++;
        }
        
        if (mul == 0) {
            if (zeros > 1) {
                for(int i=0; i<nums.length; i++) {
                     nums[i] = 0;
                }
            }
            else {
                int newMul = 1;
                for(int i=0; i<nums.length; i++) {
                    if (nums[i] != 0) newMul *= nums[i];
                }
                for(int i=0; i<nums.length; i++) {
                    if (nums[i] != 0) nums[i] = 0;
                    else nums[i] = newMul;
                }
            }
        }
        else {
            for(int i=0; i<nums.length; i++) {
                nums[i] = mul / nums[i];
            }
        }
        return nums;
    }
}