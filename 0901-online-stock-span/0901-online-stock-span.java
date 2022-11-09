class StockSpanner {
    
    private ArrayList<Integer> list;

    public StockSpanner() {
        this.list = new ArrayList<>();
    }
    
    public int next(int price) {
        int res = 1;
        for(int i=list.size()-1; i>=0; i--) {
            if (list.get(i) <= price) res++;
            else break;
        }
        this.list.add(price);
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */