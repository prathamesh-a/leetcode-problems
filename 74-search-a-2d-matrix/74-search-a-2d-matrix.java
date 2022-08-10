class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] arr : matrix) {
            int left = 0;
            int right = arr.length-1;
            int mid = (left+right)/2;
            
            while(left <= right) {
                if (arr[mid] < target) left = mid+1;
                else if (arr[mid] == target) return true;
                else right = mid-1;
                mid = (left+right)/2;
            }
        }
        return false;
    }
}