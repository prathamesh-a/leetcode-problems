class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        //System.out.println(pre);
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(pre)!=0){
                pre = pre.substring(0, pre.length()-1);
                if(pre.length()==0)return "";
            }
        }
        return pre;
    }
}