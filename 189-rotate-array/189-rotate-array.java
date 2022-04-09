class Solution {
    public void rotate(int[] nums, int k) {
        
        while(k > nums.length){
            k -= nums.length;
        }
        
        int[] arr = nums.clone();
        for(int i=0; i<arr.length; i++){
            if(i+k >= arr.length){
                nums[i+k-arr.length] = arr[i];
            }
            else nums[i+k] = arr[i];
        }
    }
}