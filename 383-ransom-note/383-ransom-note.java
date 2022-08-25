class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int lenr=ransomNote.length();
        int lenm=magazine.length();
        StringBuilder sb=new StringBuilder(magazine);
        int index=0;
        while(index<lenr)
        {
            char ch=ransomNote.charAt(index);
            int x=sb.indexOf(ransomNote.substring(index,index+1));
            if (x>=0)
            {
                sb.deleteCharAt(x);
            }
            else
            {
                return false;
            }
            index++;
        }
        return true;
    }
}