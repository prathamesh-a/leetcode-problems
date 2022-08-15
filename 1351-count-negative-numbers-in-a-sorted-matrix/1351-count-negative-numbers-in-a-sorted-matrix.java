class Solution {
    public int countNegatives(int[][] grid) {
        int c = 0;
        for(int[] arr : grid) {
            for(int i : arr) {
                if(i < 0) c++;
            }
        }
        return c;
    }
}