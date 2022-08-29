class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        
        
        // Arrays.sort(nums);
        // int max = 0;
        // int curr = 1;
        // for(int i=0; i<nums.length-1; i++) {
        //     if(nums[i] == nums[i+1]-1) curr++;
        //     else if (nums[i] == nums[i+1]) {}
        //     else {max = Math.max(max, curr);curr=1;}
        // }
        // max = Math.max(max, curr);
        // return max;
        
        Set<Integer> set = new HashSet<Integer>();
        for(int x : nums) set.add(x);
        
        int max = 0;
        
        for(int x : nums) {
            if(!set.contains(x-1)) {
                int num = x;
                int curr = 1;
                
                while (set.contains(num+1)) {
                    num++;
                    curr++;
                }
                
                max = Math.max(max, curr);
            }
        }
        
        return max;
    }
}