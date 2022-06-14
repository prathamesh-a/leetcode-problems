class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        int sum2=0;
        char ans;
        for(int i=0;i<s.length();i++)
        {
            sum1=s.charAt(i)+sum1;
        }
        for(int i=0;i<t.length();i++)
        {
            sum2=t.charAt(i)+sum2;
        }
        sum2=sum2-sum1;
        ans=(char)sum2;
        return ans;
    }
}