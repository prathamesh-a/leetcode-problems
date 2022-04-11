class Solution {
    public String reverseWords(String s) {
        char[] strArr =  s.toCharArray();
        int left = 0;
        int right = 0;
        while(right < s.length()){
            
            while(right < s.length() && strArr[right] != ' '){
                right++;
            }
            reverse(strArr, left, right-1);
            left = right +1;
            right = left;
            
        }
        return String.valueOf(strArr);
        
    }
    
    public char[] reverse(char[] strArr, int start, int end){
        
        while(start < end){
            char temp = strArr[start];
            strArr[start] =  strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }
        
        return strArr;
    }
}