import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i : nums){set.add(i);}
        int[] arr = new int[set.size()];
        int ind = 0;
        for(int i : set){
            nums[ind] = i;
            ind++;
        }
        return set.size();
    }
}