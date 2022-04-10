class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String s : ops){
            if(Character.isDigit(s.charAt(s.length()-1))) list.add(Integer.parseInt(s));
            else if(s.equals("+")) list.add((list.get(list.size()-1))+(list.get(list.size()-2)));
            else if(s.equals("D")) list.add(list.get(list.size()-1)*2);
            else list.remove(list.size()-1);
        }
        int ans=0;
        for(int i : list) ans += i;
        return ans;
    }
}