import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);  // 작은 금액부터 처리
        int sum = 0;
        int count = 0;

        for (int cost : d) {
            if (sum + cost > budget) break;
            sum += cost;
            count++;
        }

        return count;
    }
}