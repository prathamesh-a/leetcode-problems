class Solution {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        
        ArrayList<int[]> list = new ArrayList<>();
        int[] pick = intervals[0];
        for(var inter: intervals){
            if(pick[1]>= inter[0])
                pick[1] = (pick[1] > inter[1]) ? pick[1] : inter[1];
            else{
                list.add(pick);
                pick = inter;}
        }
        list.add(pick);
        return list.toArray(new int[list.size()][]);
        
    }
}