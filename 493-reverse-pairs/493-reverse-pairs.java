class Solution {
    public int reversePairs(int[] nums) {
        // int n = nums.length;
        // int count = 0;
        // for(int i=n-1; i>0; i--) {
        //     for(int j=i-1; j>=0; j--){
        //         long compare = nums[j];
        //         long mul = (long)nums[i]*2;
        //         if(compare > mul) count++;
        //     }
        // }
        // return count;
        
        return mergeSort(nums, 0, nums.length-1);
        
    }
    
    int mergeSort(int[] arr, int low, int high) {
        if (low >= high) return 0;
        int mid = (low+high)/2;
        int inv = mergeSort(arr, low, mid);
        inv += mergeSort(arr, mid+1, high);
        inv += merge(arr, low, mid, high);
        return inv;
    }
    
    int merge(int[] arr, int low, int mid, int high) {
        int count = 0;
        int j = mid+1;
        
        for(int i=low; i<=mid; i++) {
            while(j<=high && arr[i]>2*(long)arr[j]){
                j++;
            }
            count += j-(mid+1);
        }
        
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low, right = mid+1;
        while(left <= mid && right<=high) {
            if(arr[left] <= arr[right]) temp.add(arr[left++]);
            else temp.add(arr[right++]);
        }
        
        while(left<=mid) temp.add(arr[left++]);
        while(right<=high) temp.add(arr[right++]);
        
        for(int i=low; i<=high; i++) {
            arr[i] = temp.get(i-low);
        }
        
        return count;
    }
}