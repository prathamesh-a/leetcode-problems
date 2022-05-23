import java.math.BigInteger;  
class Solution {
    public int[] plusOne(int[] digits) {
        String num1 = "";
        for(int i : digits) num1 += i;
        BigInteger num2 = new BigInteger(num1);
        num2 = num2.add(new BigInteger("1"));
        String num3 = num2.toString();
        
        int[] arr = new int[num3.length()];
        for(int i=0; i<num3.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(num3.charAt(i)));
        }
        
        return arr;
     }
}