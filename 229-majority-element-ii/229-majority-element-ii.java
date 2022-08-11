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
        
        
        // List<Integer> list = new ArrayList<>();
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i : nums) {
        //     if (map.containsKey(i)) map.put(i, map.get(i)+1);
        //     else map.put(i, 1);
        //     if(map.get(i) > nums.length/3) if(!list.contains(i)) list.add(i);
        // }
        // return list;
        
        int n1 = -1, n2 = -1, c1 = 0, c2 = 0, n = nums.length;
        
        for(int i=0; i<n; i++) {
            if(nums[i] == n1) c1++;
            else if(nums[i] == n2) c2++;
            else if(c1 == 0){
                n1 = nums[i];
                c1 = 1;
            }
            else if(c2 == 0) {
                n2 = nums[i];
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        c1 = 0;
        c2 = 0;
        for(int i : nums) {
            if(i == n1) c1++;
            else if(i == n2) c2++;
        }
        
        if(c1 > n/3) list.add(n1);
        if(c2 > n/3) list.add(n2);
        
        return list;
    }
}