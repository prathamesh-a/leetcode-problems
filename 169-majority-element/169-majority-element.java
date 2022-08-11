class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        return nums[nums.length/2];
        
        
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i : nums) {
        //     if (map.containsKey(i)) {
        //         if((map.get(i)+1) > nums.length/2) return i; 
        //         map.put(i, map.get(i)+1);
        //     }
        //     else map.put(i, 1);
        // }
        // return nums[0];
        
//         for(int i=0; i<nums.length-1; i++) {
//             for(int j=i+1; j<nums.length; j++) {
                
//             }
//         }
        
    }
}