class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        
        ArrayList<int[]> list = new ArrayList<>();
        
        int low = intervals[0][0], high = intervals[0][1];

        for(int i=1; i<intervals.length; i++) {

            if (intervals[i][0] <= high) {
                low = Math.min(low, intervals[i][0]);
                high = Math.max(high, intervals[i][1]);
            }
            else {
                list.add(new int[]{low, high});
                low = intervals[i][0];
                high = intervals[i][1];
                
                //if (i == intervals.length-1) list.add(new int[]{intervals[i][0], intervals[i][1]}); 
            }
        }
        
        list.add(new int[]{low, high});
            
        int[][] arr = new int[list.size()][];
        arr = list.toArray(arr);
         
        return arr;

    }
}