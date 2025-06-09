import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 오름차순: 가장 낮은 점수가 맨 위

        for (int i = 0; i < score.length; i++) 
        {
            pq.offer(score[i]);
            if (pq.size() > k) 
            {
                pq.poll(); // k개 초과 시 가장 낮은 점수 제거
            }
            answer[i] = pq.peek(); // 현재 상위 k개 중 가장 낮은 점수
        }
        return answer;
    }
}