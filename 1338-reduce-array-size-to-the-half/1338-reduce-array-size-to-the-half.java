class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++) {
            int occ = hm.getOrDefault(arr[i], 0);
            occ++;
            hm.put(arr[i], occ);
        }
        TreeMap<Integer, HashSet<Integer>> tm = new TreeMap<>(Collections.reverseOrder());
        for(Integer key : hm.keySet()) {
            int val = hm.get(key);
            HashSet<Integer> hs = tm.getOrDefault(val, new HashSet<>());
            hs.add(key);
            tm.put(val, hs);
        }
        
        int numsToRemove = n/2;
        int ans = 0;
        
        for(Integer occ : tm.keySet()) {
            HashSet<Integer> hs = tm.get(occ);
            if(hs.size() * occ <= numsToRemove) {
                numsToRemove -= hs.size() * occ;
                ans += hs.size();
            } else {
                int toRemove = (int)(Math.ceil((double)numsToRemove/(double)occ));
                if(toRemove == 0) {
                    toRemove = 1;
                }
                numsToRemove -= toRemove*occ;
                ans += toRemove;
            }
            
            if(numsToRemove <= 0) {
                break;
            }
        }
        return ans;
    }
}