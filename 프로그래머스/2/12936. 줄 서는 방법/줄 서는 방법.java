import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        int index = 0;
        
        for (int i = 1; i <= n; i++)
            list.add(i);
        k--;

        for (int i = n - 1; i >= 0; i--) {
            long f = factorial(i);
            int pos = (int)(k / f);
            answer[index++] = list.get(pos);
            list.remove(pos);
            k %= f;
        }

        return answer;
    }

    public long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}
