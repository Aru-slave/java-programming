import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        // 배열 요소를 큐에 넣기
        for(int i = 0; i < numbers.length; i++)
            q.add(numbers[i]);
        
        // 0부터 9까지 확인하며
        for(int i = 0; i < 10; i++) {
            // 큐가 비었으면 answer에 더하기
            if(q.isEmpty()) {
                answer += i;
                continue;
            }
            
            if(q.peek() == i) {
                q.poll();  // 값 제거
            } else {
                answer += i;
            }
        }
        return answer;
    }
}