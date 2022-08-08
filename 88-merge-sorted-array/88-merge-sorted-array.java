class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-1;
        int q = n-1;
        int c = (m+n)-1;
        
        while (p>=0 && q>=0) {
            int a = nums1[p];
            int b = nums2[q];
            
            if (a >= b) {
                nums1[c] = a;
                p--;
            }
            else if (a < b) {
                nums1[c] = b;
                q--;
            }
            
            c--;
        }
        
        while (q>=0) {
            int b = nums2[q];
            nums1[c] = b;
            q--;
            c--;
        }
    }
}