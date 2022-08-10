class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        
        final int n = arr.length;
        final long[] dp = new long[n];
        final int mod = 1000_000_007;
        final Map<Integer, Integer> numIndex = new HashMap<>();
        
        long res = 0;
                
        Arrays.sort(arr);
        
        for (int i=0; i<n; i++) {
            dp[i] = 1;
            numIndex.put(arr[i], i);
            for (int j=0; j<i; j++) {
                if (arr[i] % arr[j] == 0) {
                    Integer index = numIndex.get(arr[i]/arr[j]);
                    if (index != null) {
                        dp[i] = (dp[i] + (dp[index] * dp[j])%mod)%mod;
                    }
                }
            }
            res = (res + dp[i])%mod;
        }
        
        return (int) res;
    }
}