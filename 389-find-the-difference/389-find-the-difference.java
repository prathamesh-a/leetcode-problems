class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr = s.toCharArray();
        for(char c : arr){
            t = t.replaceFirst(String.valueOf(c), "");
        }
        return t.charAt(0);
    }
}