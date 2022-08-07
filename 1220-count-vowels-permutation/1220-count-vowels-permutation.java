class Solution {
    public int countVowelPermutation(int n) {
        
        int mod = 1000_000_007;
        long countA = 1, countE = 1, countI = 1, countO = 1, countU = 1;
        
        while (--n != 0) {
            long newCountA = (countE + countI + countU) % mod;
            long newCountE = (countA + countI) % mod;
            long newCountI = (countE + countO) % mod;
            long newCountO = countI;
            long newCountU = (countI + countO) % mod;
            countA = newCountA;
            countE = newCountE;
            countI = newCountI;
            countO = newCountO;
            countU = newCountU;
        }
        
        return (int) ((countA + countE + countI + countO + countU) % mod);
    }
}