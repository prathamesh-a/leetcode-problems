class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        int[][] m2 = new int[n][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                m2[j][n-1-i] = matrix[i][j];
            }
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = m2[i][j];
            }
        }
        
    }
}