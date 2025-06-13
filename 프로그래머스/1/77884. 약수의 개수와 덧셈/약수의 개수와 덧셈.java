class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int sqrt = (int)Math.sqrt(i);
            if (sqrt * sqrt == i) {
                answer -= i; // 제곱수인 경우
            } else {
                answer += i; // 그 외
            }
        }
        return answer;
    }
}