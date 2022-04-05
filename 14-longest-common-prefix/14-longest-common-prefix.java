class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        System.out.println(pre);
        for(int i=1; i<strs.length; i++){
            String curr = strs[i];
            String pre2 = "";
            for(int j=0; j<(Math.min(curr.length(), pre.length())); j++){
                if(curr.charAt(j) == pre.charAt(j)){
                    pre2 += String.valueOf(curr.charAt(j));
                }
                else break;
            }
            pre = pre2;
        }
        return pre;
    }
}