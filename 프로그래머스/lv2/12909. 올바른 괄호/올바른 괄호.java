import java.util.*;
class Solution {
    boolean solution(String s) {
        Queue<Character> q = new LinkedList<>();
        int index = 0;
        if (s.charAt(0) == ')') {
            return false;
        } else {
            q.offer(s.charAt(0));
            index++;
        }
        while (index < s.length()) {
            char c = s.charAt(index);
            if (c == '(') {
                q.offer(c);
            } else if(!q.isEmpty()){
                if (q.peek() == '(') {
                    q.poll();
                } else {
                    return false;
                }
            }
            else return false;
            index++;
        }
        return q.isEmpty();
    }
}