class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        // List<Integer> list = new ArrayList<>();
        // int x = nums.length/3;
        // if (nums.length < 3) {
        //     for(int i : nums) if(!list.contains(i)) list.add(i);
        //     return list;
        // }
        // for(int i=0; i<nums.length-x; i++) {
        //     if(list.contains(nums[i])) continue;
        //     int f = 1;
        //     for(int j=i+1; j<nums.length; j++) {
        //         if(nums[j] == nums[i]) f++;
        //         if(f>x) {
        //             list.add(nums[i]);
        //             break;
        //         }
        //     }
        // }
        // return list;
        
        List<Integer> list = new ArrayList<>();
        
        if (nums.length < 3) {
            for(int i : nums) if(!list.contains(i)) list.add(i);
            return list;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            if (map.containsKey(i)) {
                if((map.get(i)+1) > nums.length/3) {
                    if(!list.contains(i))list.add(i);
                } 
                map.put(i, map.get(i)+1);
            }
            else map.put(i, 1);
        }
        return list;
    }
}