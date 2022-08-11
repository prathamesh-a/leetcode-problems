class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > peak) {
                idx = i;
                peak = arr[i];
            }
        }
        return idx;
    }
}