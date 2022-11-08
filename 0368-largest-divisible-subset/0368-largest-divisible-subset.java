class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        // return fn(0, -1, nums);
        
        int[] dp  = new int[nums.length];
        int[] hash = new int[dp.length];
        Arrays.fill(dp, 1);
        int max = 1;
        int last = 0;
        for(int i=0; i<nums.length; i++) {
            hash[i] = i;
            for(int j=0; j<i; j++) {
                if (nums[i]%nums[j]==0 && dp[i] <= 1+dp[j]) {
                    dp[i] = 1 + dp[j];
                    hash[i] = j;
                }
            }
            if (dp[i] > max) {
                max = dp[i];
                last = i;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[last]);
        while (hash[last] != last) {
            last = hash[last];
            list.add(nums[last]);
        }
        Collections.reverse(list);
        return list;
    }
    
    private ArrayList<Integer> fn(int i, int prev, int[] arr) {
        if (i >= arr.length) return new ArrayList<>();
        
        ArrayList<Integer> take = new ArrayList<>();
        if (prev == -1 || arr[i]%arr[prev] == 0 || arr[prev]%arr[i] == 0) {
            take.add(arr[i]);
            take.addAll(fn(i+1, i, arr));
        }
        
        ArrayList<Integer> no = fn(i+1, prev, arr);
        
        if (take.size() > no.size()) return take;
        else return no;
    }
    
//     private ArrayList<Integer> fn(int i, int prev, int[] arr, ArrayList<Integer> ls) {
//         if (i >= arr.length) return new ArrayList<>();
        
//         System.out.println(i + ", " + prev + " -> " + ls);
        
//         ArrayList<Integer> take = new ArrayList<>();
//         if (prev == -1) {
//             take.add(arr[i]);
//             ls.add(arr[i]);
//             take.addAll(fn(i+1, i, arr, ls));
//         }
//         else {
//             boolean flag = false;
//             for(int x : ls) {
//                 if (arr[i]%x == 0 || x%arr[i] == 0) flag = true;
//             }
//             if (flag) {
//                 take.add(arr[i]);
//                 ls.add(arr[i]);
//                 take.addAll(fn(i+1, i, arr, ls));
//             }
//         }
        
//         ArrayList<Integer> no = fn(i+1, prev, arr, ls);
        
//         if (take.size() > no.size()) {ls.addAll(take); return take;}
//         else {ls.addAll(no); return no;}
//     }
}