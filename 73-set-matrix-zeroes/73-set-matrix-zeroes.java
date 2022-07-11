class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 0) {
                    for(int i1=0; i1<n; i1++) arr[i1][j] = 8;
                    for(int j1=0; j1<m; j1++) arr[i][j1] = 8;
                }
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 8) matrix[i][j] = 0;
            }
        }
    }
}