class Solution {
    public void rotate(int[] nums, int k) {
        while(k > nums.length){
            k -= nums.length;
        }
        int[] arr = nums.clone();
        
        int i=0,j=1;
        while(i<arr.length || j<arr.length){
            if(i+k >= arr.length && i<arr.length){
                nums[i+k-arr.length] = arr[i];
            }
            else if(i<arr.length) nums[i+k] = arr[i];
            if(j+k >= arr.length && j<arr.length){
                nums[j+k-arr.length] = arr[j];
            }
            else if(j<arr.length) nums[j+k] = arr[j];
            i+=2;j+=2;
        }
        
        // for(int i=0; i<arr.length; i++){
        //     if(i+k >= arr.length){
        //         nums[i+k-arr.length] = arr[i];
        //     }
        //     else nums[i+k] = arr[i];
        // }
    }
}