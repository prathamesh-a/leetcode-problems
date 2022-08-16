class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<=1) return true;
        long start =0, end = (long)Math.sqrt(c);
        while(start<=end){
            long ev = start*start + end*end;
            if(ev== c)
            return true;
            else if(ev>c)
            end--;
            else
            start++;
        }
        return false;
    }
}