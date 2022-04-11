class Solution {

public boolean isHappy(int n) {     
    if(isNumber(n) == 1) return true;
    return false;
}
private int isNumber(int n){
    int sum = 0;
     if( n == 1) return 1;
     if( n == 16) return -1;
    
    while( n > 0){
        int d = n % 10;
        n /= 10;
        sum += d*d;
    }
    return isNumber(sum);
}
}

