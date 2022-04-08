class KthLargest {
    
    int k;
    PriorityQueue<Integer> q = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i : nums) this.add(i);
    }
    
    public int add(int val) {
        q.add(val);
        while(q.size() > k) q.remove();
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */