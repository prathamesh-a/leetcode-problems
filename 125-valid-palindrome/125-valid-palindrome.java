class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int st = 0;
        int e = s.length()-1;
        while (st < e) {
            if (s.charAt(st) != s.charAt(e)) return false;
            st++;
            e--;
        }
        return true;
    }
}