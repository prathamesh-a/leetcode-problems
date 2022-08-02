class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                queue.add(matrix[i][j]);
            }
        }
        while(k>1)
        {
            queue.poll();
            k--;
        }
        return queue.poll();
    }
}