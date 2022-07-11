class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            
            subList.add(1);
            if(i!=0){
                
                List<Integer> prev = list.get(i-1);
                
                for(int j=1; j<prev.size(); j++) {
                    int sum = prev.get(j-1) + prev.get(j);
                    subList.add(sum);
                }
                
                subList.add(1);
            }
            list.add(subList);
        }
        return list;
    } 
}