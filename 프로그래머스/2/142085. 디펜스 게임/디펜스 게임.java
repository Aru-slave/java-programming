import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        //적의 수를 더할 때, 가장 큰 수가 먼저 나올 수 있게 PriorityQueue에 저장함.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 큰 수부터 나오게
        for(int i = 0; i < enemy.length; i++)
        {
            pq.add(enemy[i]);
            n -= enemy[i];
            if( n < 0)
            {
                if(k > 0 && pq.size() > 0)
                {
                    k--;
                    n += pq.poll();
                }
                else
                    return i;
            }
        }
        return enemy.length;
    }
}