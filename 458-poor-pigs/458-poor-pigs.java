class Solution {
    public int poorPigs(int buckets, int poisonTime, int totalTime) {
        double ans ;
        ans = Math.ceil(Math.log(buckets) / Math.log(totalTime / poisonTime + 1));
        return (int)ans;
    }
}