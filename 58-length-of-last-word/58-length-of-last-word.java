class Solution {
    public int lengthOfLastWord(String s) {
        int sLen = s.length(), length=0;
        for(int i=sLen-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                if(length>0)return length;
            }
            else{
                length++;
            }
        }
        return length;
        
    }
}