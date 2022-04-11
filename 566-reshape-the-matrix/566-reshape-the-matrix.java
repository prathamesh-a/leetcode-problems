class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    int m = mat.length;
    int n = mat[0].length;
    if(r*c != m*n) return mat;
    if (r==m && n == c) return mat;
    
    int [][] res = new int[r][c];
    int n_index = 0;
    int o_index = 0;
    while(n_index<r*c && o_index<m*n){
        res[n_index/c][n_index%c] = mat[o_index/n][o_index%n];
        n_index++;
        o_index++;
    }
    return res;
}
}