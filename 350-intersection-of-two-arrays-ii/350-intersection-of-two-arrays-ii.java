class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) return intersect(nums2, nums1);
        int[] arr = new int[1001];
        for(int n : nums2) arr[n]++;
        int j=0;
        for(int i=0; i<nums1.length; i++) if(arr[nums1[i]]-- > 0) nums1[j++] = nums1[i];
        if(j==nums1.length) return nums1;
        int[] ans = new int[j];
        for(int i=0; i<j; i++) ans[i] = nums1[i];
        return ans;
    }
}