class Solution {
    public int maxProfit(int[] arr) {
        int profit = 0;
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            if(curr < min){
                min = curr;
                continue;
            }
            profit = Math.max(profit, curr-min);
        }
        return profit;
    }
}