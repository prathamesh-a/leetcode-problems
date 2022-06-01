class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, String> map = new HashMap<>();
        char[] charArr = pattern.toCharArray();
        String[] strArr = s.split(" ");
        if(charArr.length != strArr.length) return false;
        for(int i=0; i<charArr.length; i++){
            String c = String.valueOf(charArr[i]);
            if(map.containsKey(c)){
                if(!map.get(c).equals(strArr[i])) return false;
            }else{
                if(map.containsValue(strArr[i])) return false;
                map.put(c, strArr[i]);
            }
        }
        return true;
    }
}