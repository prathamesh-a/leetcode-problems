import java.util.*;
class Solution {
    
    public boolean isPalindrome(int x) {
        
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();
        
        for(int i=0; i<s.length()/2; i++){
            if(arr[i] != arr[s.length()-(i+1)])return false;
        }
        
        return true;
    }
}