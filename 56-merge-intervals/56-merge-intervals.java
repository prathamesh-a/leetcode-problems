class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        
        ArrayList<int[]> list = new ArrayList<>();
        
        int low = intervals[0][0], high = intervals[0][1];

        for(int[] arr : intervals) {

            if (arr[0] <= high) {
                high = Math.max(high, arr[1]);
            }
            else {
                list.add(new int[]{low, high});
                low = arr[0];
                high = arr[1];
            }
        }
        
        list.add(new int[]{low, high});
         
        return list.toArray(new int[0][]);

    }
}