class Solution {
    public int maxResult(int[] nums, int k) {
        if(nums.length==0)return 0;
        
        int max=nums[0];
        Queue<int[]> pq = new PriorityQueue<>((a,b)-> (b[0]-a[0]));
        pq.offer(new int[]{nums[0],0});
        for(int i=1;i<nums.length;i++){
            
            while(i-pq.peek()[1]>k){
                pq.poll();
            }
            int[] curr = pq.peek();
            max = nums[i]+ curr[0];
            pq.offer(new int[]{max,i});
        }
        return max;
    }
}