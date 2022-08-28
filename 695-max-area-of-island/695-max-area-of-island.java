class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        boolean visited[][] = new boolean[m][n];
        
        int ans = 0;
        for(int i  = 0 ; i < m ; i++)
            for(int j = 0 ; j < n ; j++)
            {
                if(grid[i][j] == 1 && !visited[i][j])
                {
                    int sum = dfs(grid , i , j , visited);
                    ans = Math.max(sum , ans);
                }
            }
        return ans;
    }
	
    private int dfs(int[][] grid , int i , int j , boolean[][] visited)
    {
        if(i>=0 && j >= 0 && i<grid.length && j<grid[0].length && !visited[i][j])
        {
            if(grid[i][j] == 1)
            {
                visited[i][j] =  true;
                return 1 + dfs(grid , i + 1 , j , visited) + dfs(grid , i - 1 , j , visited) + dfs(grid , i  , j+ 1, visited) +
				dfs(grid , i  , j- 1, visited);
            }
        }return 0;
    }
}