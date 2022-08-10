class Solution {
    public double myPow(double x, int N) {
        
        // double res = 1;
        // if (n > 0) {
        //     for (int i=1; i<=n; i++) res *= x;
        //     return res;
        // }
        // else if (n < 0) {
        //     n *= -1;
        //     for (int i=1; i<=n; i++) res *= x;
        //     return 1/res;
        // }
        // return res;
        
        double res = 1;
        long n = N;
        if(n<0) n *= -1;
        
        while (n > 0) {
            if (n%2 == 1) {
                res *= x;
                n--;
            }
            else{
                x *= x;
                n /= 2;
            }
        }
        
        if (N<0) return 1/res;
        return res;
        
    }
}