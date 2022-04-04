import java.util.*;
class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            if(a == '(' || a == '{' || a == '['){
                stack.push(a);
            }
            else if(stack.empty()) return false;
            else if(a == ')' && stack.pop() != '(') return false;
            else if(a == ']' && stack.pop() != '[') return false;
            else if(a == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
    }
}