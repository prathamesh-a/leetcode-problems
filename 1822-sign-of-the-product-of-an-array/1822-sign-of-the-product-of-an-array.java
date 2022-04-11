class Solution {
    public int arraySign(int[] nums) {
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            int c = p * nums[i];
            if (c == 0) return 0;
            if (c > 0) p = 1;
            else p = -1;
        }   
        return p;
    }
}