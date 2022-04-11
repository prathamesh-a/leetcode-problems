class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt = 0;
        int[] d = new int[26];
        for( int i = 0 ; i < s1.length() ; i++ ){
            if ( s1.charAt(i) != s2.charAt(i) ){
                cnt++;
                d[s1.charAt(i) - 'a'] += 1;
                d[s2.charAt(i) - 'a'] -= 1;
            }
        }
        
        for(int i = 0 ; i < 26 ; i++ )
            if ( d[i] != 0 )
                return false;
        
        if ( cnt == 0 || cnt == 2 )
            return true;
        
        return false;
    }
}