class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        int x = nums.length/3;
        
        if (nums.length < 3) {
            for(int i : nums) if(!list.contains(i)) list.add(i);
            return list;
        }
        
        for(int i=0; i<nums.length-x; i++) {
            if(list.contains(nums[i])) continue;
            int f = 1;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j] == nums[i]) f++;
                if(f>x) {
                    list.add(nums[i]);
                    break;
                }
            }
        }
        return list;
        
        // [3, 2, 2, 4, 5, 1]
    }
}