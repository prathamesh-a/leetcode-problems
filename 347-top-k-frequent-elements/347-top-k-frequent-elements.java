class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums) {
            freqMap.merge(num, 1, Integer::sum);
        }
        Queue<int[]> pQueue = new PriorityQueue<int[]>(Comparator.comparingInt(a -> a[1]));
        freqMap.forEach((key, value) -> {
            pQueue.add(new int[]{key, value});
            if(pQueue.size() > k) {
                pQueue.poll();
            }
        });
        int[] topFrequent = new int[k];
        for(int i = 0; i < k; i++) {
            topFrequent[i] = pQueue.poll()[0];
        }
        return topFrequent;
    }
}