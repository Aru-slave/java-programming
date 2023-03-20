import java.util.*;
class Solution {
    public int solution(String s) {
        //s의 길이 만큼 회전했을 때, 올바른 괄호 문자열이 몇 개인지 리턴
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i = 1; i < s.length(); i++){
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            if(check(sb.toString()))
                count++;
        }
        if(check(s)) count++;
        return count;
    }
    public boolean check(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '[' || c == '{' || c == '(')
                stack.add(c);
            else {
                if(stack.isEmpty()) return false;
                if(c == ']'){
                    if(stack.peek() == '[')
                        stack.pop();
                    else return false;
                }
                if(c == '}'){
                    if(stack.peek() == '{')
                        stack.pop();
                    else return false;
                }
                if(c == ')'){
                    if(stack.peek() == '(')
                        stack.pop();
                    else return false;
                }
            }
        }
        return stack.isEmpty();
    }
}