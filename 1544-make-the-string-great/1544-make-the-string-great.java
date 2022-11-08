class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);
        for(int i=0; i<str.length()-1; i++) {
            // System.out.println(i + " " + (i+1));
            char one = str.charAt(i);
            char two = str.charAt(i+1);
            if (one == two) continue;
            //System.out.println(one + " " + two);
            if (Character.toUpperCase(one) == two || one == Character.toUpperCase(two)) {
                str.delete(i, i+2);
                i=-1;
            }
            //System.out.println(str.toString());
        }
        return str.toString();
    }
}