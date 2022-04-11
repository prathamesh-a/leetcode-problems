class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<List<Integer>>();

        for (int i=0; i<numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j=0; j<=i; j++) {
                if (j>0 && i>0 && pascalsTriangle.get(i-1).size()-1>=j) {
                    list.add(pascalsTriangle.get(i-1).get(j-1)+pascalsTriangle.get(i-1).get(j));
                } else {
                    list.add(1);
                }
            }
            pascalsTriangle.add(list);
        }
        
        return pascalsTriangle;
    } 
}