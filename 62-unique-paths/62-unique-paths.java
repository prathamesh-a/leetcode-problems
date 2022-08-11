class Solution {
    
    // int count = 0;
    // public int uniquePaths(int m, int n) {
    //     find(m, n, 0, 0);
    //     return count;
    // }
    // private void find(int m, int n, int i, int j) {
    //     if(i >= m || j >= n) return;
    //     if(i == m-1 && j == n-1) {count++;return;}
    //     find(m,n,i,j+1);
    //     find(m,n,i+1,j);
    // }
    
    
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] arr : dp) for(int i=0; i<arr.length; i++) arr[i] = -1;
        return find(0, 0, m, n, dp);
    }
    int find(int i, int j, int m, int n, int[][] dp) {
        if(i == m-1 && j == n-1) return 1;
        if(i>=m || j>=n) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = find(i,j+1,m,n,dp) + find(i+1,j,m,n,dp);
    }
}