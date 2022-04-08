class KthLargest {
    
    int k;
    ArrayList<Integer> list;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.list  = new ArrayList<Integer>() {{ for (int i : nums) add(i); }};
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list, Collections.reverseOrder());
        return list.get(k-1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */