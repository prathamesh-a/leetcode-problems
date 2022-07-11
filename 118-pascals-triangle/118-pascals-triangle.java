class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = null;
        List<Integer> subList = null;
        
        for(int i=0; i<numRows; ++i) {
            subList = new ArrayList<>();
                        
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) subList.add(1);
                
                else {
                    int sum = prev.get(j-1) + prev.get(j);
                    subList.add(sum);
                }
            }
            prev = subList;
            list.add(subList);
        }
        return list;
    } 
}