class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        backtrack(nums,new ArrayList());
        return result;
    }
    
    public void backtrack(int[] nums,List<Integer> list)
    {
        if(list.size()==nums.length)
        {
            result.add(new ArrayList(list));
            return;
        }
        
        for(int i=0; i<nums.length; i++)
        {
            if(!list.contains(Integer.valueOf(nums[i])))
            {                
                list.add(nums[i]);
                backtrack(nums,list);
                list.remove(list.size()-1);
            }
        }
    }
}