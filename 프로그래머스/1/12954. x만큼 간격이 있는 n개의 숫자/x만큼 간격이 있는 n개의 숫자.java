import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;//시작 점.
        for(int i = 1; i < n; i++)
            answer[i] = answer[i-1] + (long)x;
        return answer;
    }
}