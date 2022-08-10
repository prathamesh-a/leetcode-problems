class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // for (int[] arr : matrix) {
        //     for(int i : arr) {
        //         if (i == target) return true;
        //     }
        // }
        // return false;
        
        // for (int[] arr : matrix) {
        //     int left = 0;
        //     int right = arr.length-1;
        //     int mid = (left+right)/2;
        //     while(left <= right) {
        //         if (arr[mid] < target) left = mid+1;
        //         else if (arr[mid] == target) return true;
        //         else right = mid-1;
        //         mid = (left+right)/2;
        //     }
        // }
        // return false;
        
        // int i = 0;
        // int j = matrix[0].length - 1;
        // while (i < matrix.length && j >= 0) {
        //     if (matrix[i][j] == target) return true;
        //     if(matrix[i][j] > target) j--;
        //     else i++;
        // }
        // return false;
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int low = 0;
        int high = n*m - 1;
        
        while (low <= high) {
            int mid = (low + (high-low)/2);
            int val = matrix[mid/m][mid%m];
            if (val == target) return true;
            if (val < target) low = mid + 1;
            else high = mid - 1;
        }
        
        return false;
    }
}