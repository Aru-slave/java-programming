import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        String prev = "";
        HashSet<String> used = new HashSet<String>();
        int turn = 1;
        
        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            if (i != 0 && current.charAt(0) != prev.charAt(prev.length() - 1)) {
                answer[0] = turn;
                answer[1] = (i / n) + 1;
                break;
            } else if (used.contains(current)) {
                answer[0] = turn;
                answer[1] = (i / n) + 1;
                break;
            } else {
                used.add(current);
                prev = current;
                turn = (turn == n) ? 1 : turn + 1;
            }
        }
        
        return answer;
    }
}