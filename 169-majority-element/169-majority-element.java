class Solution {
    public int majorityElement(int[] nums) {
        
        // Arrays.sort(nums);
        // int max = 0;
        // int res = 0;
        // int cur = nums[0];
        // int f = 1;
        // for(int i=1; i<nums.length; i++) {
        //     if (nums[i] == cur) {
        //         f++;
        //         if(f > nums.length/2) return cur;
        //     }
        //     else {
        //         if(max < f) {
        //             max = f;
        //             res = cur;
        //         }
        //         f = 1;
        //         cur = nums[i];
        //     }
        // }
        // if(max < f) {
        //     max = f;
        //     res = cur;
        // }
        // return res;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums) {
            if (map.containsKey(i)) map.put(i, map.get(i)+1);
            else map.put(i, 1);
        }
        return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
        
        
    }
}