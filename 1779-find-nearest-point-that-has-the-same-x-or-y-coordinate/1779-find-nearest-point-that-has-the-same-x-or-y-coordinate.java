class Solution {
    public int nearestValidPoint(int x, int y, int[][] arr) {
        int ans=2147483647, ind=0;
        boolean flag = true;
        for(int i=0; i<arr.length; i++){
            int a = arr[i][0];
            int b = arr[i][1];
            
            if(a==x || b==y){
                flag = false;
                int dis = Math.abs(x-a)+Math.abs(y-b);
                if(dis<ans) {ans = dis; ind=i;}
            }
        }
        
        if(flag) return -1;
        else return ind;
    }
}