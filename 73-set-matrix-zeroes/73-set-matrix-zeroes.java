class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] R = new int[n];
        int[] C = new int[m];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j]==0) {
                    R[i] = 8;
                    C[j] = 8;
                }
            }
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if (R[i]==8 || C[j]==8) matrix[i][j] = 0; 
            }
        }
        
    }
}