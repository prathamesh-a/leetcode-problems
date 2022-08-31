class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        Queue<int[]> rot=new LinkedList<>();
        int r=grid.length;
        int c=grid[0].length;
        int tot_fresh=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2)
                    rot.offer(new int[]{i , j});
                else if(grid[i][j]==1)
                    tot_fresh++;
            }
        }
        if(tot_fresh==0)
            return 0;
        int ans=0;
        int[] dx=new int[]{1,-1,0,0};
        int[] dy=new int[]{0,0,1,-1};
        while(rot.size()>0){
            int n=rot.size();
            for(int i=0;i<n;i++){
                 int[] point=rot.poll();
                for(int j=0;j<4;j++){
                    int x=point[0]+dx[j];
                    int y=point[1]+dy[j];
                    if(x<0 || y<0 || x>=r || y>=c || grid[x][y]==2 || grid[x][y]==0)
                        continue;
                    grid[x][y]=2;
                    rot.offer(new int[]{x,y});
                    tot_fresh--;
                }
                
            }
            if(rot.size() != 0) {
                ans++;
            }
        }
        return tot_fresh == 0 ? ans : -1;
    }
}