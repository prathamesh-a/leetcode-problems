class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) return Math.min(cost[0], cost[1]);
        int[] matrix = new int[cost.length + 1];
        matrix[0] = 0;
        matrix[1] = 0;
        for (int i = 2; i < matrix.length; i++) matrix[i] = Math.min(matrix[i - 1] + cost[i - 1], matrix[i - 2] + cost[i - 2]); 
        return matrix[matrix.length - 1];
    }
}