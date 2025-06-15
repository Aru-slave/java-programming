import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = null;
        LinkedList<Long> list = new LinkedList<>();
        //x는 시작점, n은 증가하는 폭
        
        for(int i = 0; i < n; i++)
        {
            list.add(((long)x + (long)x * i));
        }
        answer = new long[list.size()];
        for(int i = 0; i < n; i++)
            answer[i] = list.get(i);
        return answer;
    }
}