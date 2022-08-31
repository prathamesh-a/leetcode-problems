class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(1, n, k, new ArrayList<>(), result);    
        return result;
    }
    
    public void backTrack (int start, int end, int size, List<Integer> comb, List<List<Integer>> result) {
        
        if(comb.size() == size){
            result.add(new ArrayList<>(comb));
        }
        
        for(int i=start; i <= end; i++){
            comb.add(i);
            backTrack(i + 1, end, size, comb, result);
            comb.remove(comb.size()-1);
        }
        
    }
}