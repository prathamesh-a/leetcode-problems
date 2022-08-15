class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] ref = new int[2002];
        for (int i : arr) {
            ref[i] = -1;
        }
        //System.out.println(Arrays.toString(ref));
        for(int i=1; i<ref.length; i++) {
            if (k<=0) return i-1;
            if(ref[i] != -1) k--;
        }
        return 0;
    }
}