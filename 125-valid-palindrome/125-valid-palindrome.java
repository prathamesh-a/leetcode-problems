class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        s = s.toLowerCase();
        
        StringBuilder f = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)
				f.append(s.charAt(i));
            if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)
				f.append(s.charAt(i));
		}
        s = f.toString();
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