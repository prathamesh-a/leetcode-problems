class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        int i=0, j=nums.length-1;
        while(i<=j){
            if(nums[i]==0 || nums[j]==0) return 0;
            else if(i==j){
                int a = nums[i] > 0 ? 1 : -1;
                product *= a;
            }
            else{
                int a = nums[i] > 0 ? 1 : -1;
                int b = nums[j] > 0 ? 1 : -1;
                product *= (a*b);
            }
            i++; j--;
        }
        return product;
        
    }
}