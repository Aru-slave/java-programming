import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long sum1 = 0, sum2 = 0;

        for(int i : queue1) {
            q1.add(i);
            sum1 += i;
        }
        for(int i : queue2) {
            q2.add(i);
            sum2 += i;
        }

        int maxCount = (queue1.length + queue2.length) * 2;
        int count = 0;

        while(count <= maxCount) {
            if(sum1 == sum2) return count;
            else if(sum1 > sum2) {
                Integer num = q1.poll();
                if(num == null) return -1;
                sum1 -= num;
                sum2 += num;
                q2.add(num);
            } else {
                Integer num = q2.poll();
                if(num == null) return -1;
                sum2 -= num;
                sum1 += num;
                q1.add(num);
            }
            count++;
        }

        return -1;
    }
}
